package com.cg.dao.impl;

/*NA*/
/**
 * 
 * This is a JDBCDaoException class
 * @see java.lang.Object
 * @author Abhishek
 * 
 *
 */
public class JDBCDaoException extends RuntimeException {

    public JDBCDaoException() {
        super();
    }

    public JDBCDaoException(String message) {
        super(message);
    }

    public JDBCDaoException(Throwable cause) {
        super(cause);
    }

    public JDBCDaoException(String message, Throwable cause) {
        super(message, cause);
    }

}
