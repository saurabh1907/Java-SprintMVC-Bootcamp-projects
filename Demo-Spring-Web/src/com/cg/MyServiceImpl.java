package com.cg;

import java.util.List;

public class MyServiceImpl implements IService {
	private IDao daoRef;

	public MyServiceImpl(IDao daoRef,String msg) {
		System.out.println(msg);
		this.daoRef = daoRef;
	}

	public void setDaoRef(IDao daoRef) {
		this.daoRef = daoRef;
	}

	@Override
	public List<String> getMessages() {
		return daoRef.getMessages();
	}
}
