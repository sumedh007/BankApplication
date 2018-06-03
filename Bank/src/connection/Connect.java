package connection;
import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class Connect {
	public Connection getConnection() {
		Context ctx = null;
		DataSource ds = null;
		Connection con = null;
		
		try {

			Context initContext = new InitialContext();
			ctx = (Context) initContext.lookup("java:/comp/env");
			ds = (DataSource) ctx.lookup("jdbc/Bank");
			con = ds.getConnection();
			
		} catch (NamingException | SQLException e) {
			System.out.println(e);
		}
		return con;
	}
}