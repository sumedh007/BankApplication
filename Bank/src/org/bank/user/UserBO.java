package org.bank.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connection.Connect;

public class UserBO {
	public void createUser(UserBean userBean) {
		String pass1 = null;
		String pass2 = null;
		String query = "select email from contactinformation where account_no=?;";
		Connect c = new Connect();
		Connection connection = c.getConnection();

		if (userBean.getAccountNumber() > 10000) {
			try {
				PreparedStatement preparedStatement = connection.prepareStatement(query);
				preparedStatement.setLong(1, userBean.getAccountNumber());
				ResultSet resultSet1 = preparedStatement.executeQuery();

				if (resultSet1.next()) {
					userBean.setUsername(resultSet1.getString(1));
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			PreparedStatement preparedStatement2;
			try {
				preparedStatement2 = connection
						.prepareStatement("select fname, lname from personal_information where account_no=?;");
				preparedStatement2.setLong(1, userBean.getAccountNumber());
				ResultSet resultSet2 = preparedStatement2.executeQuery();
				if (resultSet2.next()) {
					pass1 = resultSet2.getString(1);
					pass2 = resultSet2.getString(2);
					userBean.setPassword(pass1 + "_" + pass2);
				}

				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			try {
				PreparedStatement preparedStatement3 = connection.prepareStatement("insert into user (account_no, username, password) values(?,?,?);");
				preparedStatement3.setLong(1, userBean.getAccountNumber());
				preparedStatement3.setString(2, userBean.getUsername());
				preparedStatement3.setString(3, userBean.getPassword());
				boolean sql=preparedStatement3.execute();
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}