package com.cg.util;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class ServiceLocator {
	static DataSource getDataSource() throws NamingException{
		
		
		Context envContext = new InitialContext();
		
		Context context = (Context) envContext.lookup("java:/comp/env");
		
		DataSource ds = (DataSource) context.lookup("jdbc/MyDataSource");
		
		return ds;
		
	}
}
