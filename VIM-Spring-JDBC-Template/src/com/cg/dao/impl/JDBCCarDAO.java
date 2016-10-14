package com.cg.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cg.dao.CarDAO;
import com.cg.dto.CarDTO;
/*NA*/
/**
 * 
 * This is a JDBCCarDAO class
 * @see java.lang.Object
 * @author Abhishek
 * 
 *
 */

@Repository
public class JDBCCarDAO implements CarDAO {
	
//	private JdbcTemplate jdbcTemplate;
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;;
	
	private DataSource dataSource;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
//		this.jdbcTemplate = new JdbcTemplate(dataSource);
		this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}
	
	/*@Override
		public void create(CarDTO car) {
			BeanPropertySqlParameterSource sqlParameterSource;
			sqlParameterSource = new BeanPropertySqlParameterSource(car);
			
			String insertQuery = "insert into Car (MAKE,MODEL,MODEL_YEAR) values(:make,:model,:modelYear)";
			
			namedParameterJdbcTemplate.update(insertQuery, sqlParameterSource);
			
		}*/
	
	
	
	
/*	
//	Service-Locator not required
	public JDBCCarDAO() {
		try{
			Context ctx = new InitialContext();
			Context envContext  = (Context)ctx.lookup("java:/comp/env");
			dataSource = (DataSource)envContext.lookup("jdbc/VIMDataSource");
		}
		catch(ServiceLocatorException e){
			e.printStackTrace();
			throw new ServiceLocatorException("Container Service not available");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
*/
	
	@Override
	/**
	 * This method is mapped to ADD_CAR_ACTION
	 * @param car a CarDTO 
	 */
	public void create(CarDTO car) {
		// TODO Auto-generated method stub
		Connection connection = null;

		String insertQuery = "insert into Car (MAKE,MODEL,MODEL_YEAR) values(?,?,?)";
		
		try{
			try {
				connection = dataSource.getConnection();
				connection.setAutoCommit(false);
				PreparedStatement insertStatement = connection.prepareStatement(insertQuery);

				insertStatement.setString(1, car.getMake());
				insertStatement.setString(2, car.getModel());
				insertStatement.setString(3, car.getModelYear());

				insertStatement.executeUpdate();
				connection.commit();
			} 
			catch (SQLException e) {
//				e.printStackTrace();
				
				if (connection != null)
					connection.rollback();
				throw e;
			} 
			finally {
				if (connection != null)
					connection.close();			
			}
		}
		catch(SQLException e){
			throw new JDBCDaoException("SQL error while excecuting this query: "+ insertQuery,e);
		}
		
	}

	@Override
	/**
	 * This method is mapped to DELETE_CAR_ACTION
	 * @param ids collection of CAR ids. 
	 */
	public void delete(String[] ids) {
		Connection connection = null;
		String deleteQuery = "delete from car where id=?";

		try{
			try {
				connection = dataSource.getConnection();
				connection.setAutoCommit(false);
				PreparedStatement deleteStatement = connection
				.prepareStatement(deleteQuery);

				for (String id : ids) {				
					deleteStatement.setInt(1, Integer.parseInt(id));
					deleteStatement.executeUpdate();
				}
				connection.commit();
			} 
			catch (SQLException e) {
				if (connection != null)
					connection.rollback();	
				
				throw e;
			} 
			finally {
				if (connection != null)
					connection.close();				
			}
		}
		catch(SQLException e){
			throw new JDBCDaoException("SQL error while excecuting query: "+ deleteQuery,e);
		}		
	}

	@Override
	/**
	 * This method is mapped to EDIT_CAR_ACTION
	 * @param car a CarDTO 
	 */
	public void update(CarDTO car) {
		// TODO Auto-generated method stub
		String updateQuery = "update car set make=?,model=?,model_year=? where id=?";
		Connection connection = null;
		
		try{
			try {
				connection = dataSource.getConnection();
				connection.setAutoCommit(false);
				PreparedStatement updateStatement = connection
				.prepareStatement(updateQuery);
				updateStatement.setString(1, car.getMake());
				updateStatement.setString(2, car.getModel());
				updateStatement.setString(3, car.getModelYear());
				updateStatement.setInt(4, car.getId());
				updateStatement.executeUpdate();
				connection.commit();
			} 
			catch (SQLException e) {
				if(connection != null)
					connection.rollback();
				
				throw e;
			}
			finally {
				if (connection != null)
					connection.close();			
			}
		}
		catch(SQLException e){
			throw new JDBCDaoException("SQL error while excecuting query: "+ updateQuery,e);
		}
	}
	
	
	@Override
	/**
	 * This method is mapped to VIEW_CAR_LIST_ACTION
	 * @return List list of cars 
	 */
	public List<CarDTO> findAll() {
		List<CarDTO> carList = new ArrayList<CarDTO>();

		Connection connection = null;
		String selectQuery = "select * from CAR";
		
		try{
			try {
				connection = dataSource.getConnection();
				connection.setAutoCommit(true);
				
				Statement selectStatement = connection.createStatement();

				ResultSet result = selectStatement.executeQuery(selectQuery);

				while (result.next()) {
					CarDTO car = new CarDTO();
					car.setId(result.getInt("ID"));
					car.setMake(result.getString("MAKE"));
					car.setModel(result.getString("MODEL"));
					car.setModelYear(result.getString("MODEL_YEAR"));
					carList.add(car);
				}
			} 
			finally {
				if (connection != null)
					connection.close();				
			}
		}
		catch(SQLException e){
			throw new JDBCDaoException("SQL error while excecuting query: "+ selectQuery,e);
		}		

		return carList;
	}

	@Override
	/**
	 * This method is utility method for finding car by id.
	 * @param id id of the car to be searched
	 * @return  CarDTO A CarDTO
	 */
	public CarDTO findById(int id) {
		// TODO Auto-generated method stub
		String selectQuery = "select * from CAR where id=?";
		CarDTO car = new CarDTO();
		Connection connection = null;
		
		try{
			try {
				connection = dataSource.getConnection();
				connection.setAutoCommit(true);
				PreparedStatement selectStatement = connection
				.prepareStatement(selectQuery);
				selectStatement.setInt(1, id);
				ResultSet result = selectStatement.executeQuery();
				result.next();

				car.setId(result.getInt("id"));
				car.setMake(result.getString("make"));
				car.setModel(result.getString("model"));
				car.setModelYear(result.getString("MODEL_YEAR"));
			} 
			finally {
				if (connection != null)
					connection.close();			
			}
		}
		catch(SQLException e){
			throw new JDBCDaoException("SQL error while excecuting query: "+ selectQuery,e);
		}		

		return car;
	}

	

}
