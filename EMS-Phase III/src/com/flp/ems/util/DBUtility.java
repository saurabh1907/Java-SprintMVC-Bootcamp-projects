package com.flp.ems.util;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DBUtility {
	private DBUtility() {

	}

	public static DataSource getDataSource(String dataSourceJndiName) {
		DataSource dataSource = null;

		try {
			Context ctx = new InitialContext();
			Context envContext = (Context) ctx.lookup("java:/comp/env");
			dataSource = (DataSource) envContext.lookup(dataSourceJndiName);
		} catch (ClassCastException ce) {
			ce.printStackTrace();
		} catch (NamingException e) {
			e.printStackTrace();
		}

		return dataSource;

	}

}
