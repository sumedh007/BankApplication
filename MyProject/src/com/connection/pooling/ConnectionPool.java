package com.connection.pooling;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class ConnectionPool {
	public DataSource getConnection() {
		Context ctx = null;
		DataSource ds = null;
		try {

			Context initContext = new InitialContext();
			ctx = (Context) initContext.lookup("java:/comp/env");
			ds = (DataSource) ctx.lookup("jdbc/testdb");
		} catch (NamingException e) {
			System.out.println(e);
		}
		return ds;
	}
}