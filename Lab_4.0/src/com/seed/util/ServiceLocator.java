package com.seed.util;

import javax.naming.*;
import javax.sql.*;
//(C)Copyright 2008 SEED Infotech,  All Rights Reserved.
/**
 * 
 * This is a ServiceLocator class
 * @see java.lang.Object
 * @author Abhishek
 * 
 *
 */

/**
 * <code>ServiceLocator</code> encapsulates JNDI lookups to make it
 * easier to access JNDI-based resources (EJBs, DataSources,
 * JMS Destinations, and so on).
 *
 */

//TODO:0	Don't modify this resource
public class ServiceLocator {

    /**
     * Making the default (no arg) constructor private
     * ensures that this class cannnot be instantiated.  
     */
    private ServiceLocator() {}
    
    
    /**
     * Gets a <code>DataSource</code> using the given JNDI name.
     *
     * @param dataSourceJndiName The <code>DataSource</code>'s JNDI name.
     *
     * @return DataSource The <code>DataSource</code>.
     *
     * @throws ServiceLocatorException If there are JNDI lookup problems.
     *
     * @see javax.sql.DataSource
     */
    public static DataSource getDataSource(String dataSourceJndiName) throws ServiceLocatorException {
        DataSource dataSource = null;

        try {
            Context ctx = new InitialContext();
            Context envContext  = (Context)ctx.lookup("java:/comp/env");
            dataSource = (DataSource) envContext.lookup(dataSourceJndiName);
            
        } catch (ClassCastException cce) {
            throw new ServiceLocatorException(cce);
        } catch (NamingException ne) {
            throw new ServiceLocatorException(ne);
        }

        return dataSource;
    }
}
