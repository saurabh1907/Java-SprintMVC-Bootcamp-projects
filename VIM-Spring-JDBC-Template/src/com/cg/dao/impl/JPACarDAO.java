package com.cg.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cg.dao.CarDAO;
import com.cg.dto.CarDTO;

//@Repository
public class JPACarDAO implements CarDAO{
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	@Transactional
	public void create(CarDTO car) {
		// TODO Auto-generated method stub
		
//		EntityTransaction tx = entityManager.getTransaction();
		try {
//			tx.begin();
			entityManager.persist(car);
//			tx.commit();
			
			System.out.println("After commit .................");
			
		} catch (RuntimeException e) {
//			tx.rollback();
			throw e;
		} finally {
			entityManager.close();
		}
	}
	
	@Override
	public void delete(String[] ids) {
		
		EntityTransaction tx = entityManager.getTransaction();
		try {
			tx.begin();
			
			for(String sID : ids){
				CarDTO car = entityManager.find(CarDTO.class, Integer.parseInt(sID));
				entityManager.remove(car);
			}
			
			tx.commit();
		} catch (RuntimeException e) {
		tx.rollback();
		throw e;
		} finally {
		entityManager.close();
		}		
	}
	
	@Override
	public List<CarDTO> findAll() {
		
		try {
			Query query = entityManager.createQuery(
			"select car from CarDTO car");
			return query.getResultList();
		} finally {
		entityManager.close();
		}
	}
	
	@Override
	public CarDTO findById(int id) {
		
		CarDTO car = (CarDTO) entityManager.find(CarDTO.class, id);
		return car;
	}
	
	@Override
	public void update(CarDTO car) {
		
		EntityTransaction tx = entityManager.getTransaction();
		try {
			tx.begin();
			entityManager.merge(car);
			tx.commit();
			
			System.out.println("After commit .................");
			
		} catch (RuntimeException e) {
			tx.rollback();
			throw e;
		} finally {
			entityManager.close();
		}
	}
}
