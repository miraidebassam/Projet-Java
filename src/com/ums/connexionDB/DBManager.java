package com.ums.connexionDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.ums.exceptions.DAOException;

public class DBManager {
	private static Connection connection = null;
	
	@SuppressWarnings("deprecation")
	public static Connection getConnection() throws Exception {
		try {
			// Chargement du driver jdbc mysql
			Class.forName ("com.mysql.cj.jdbc.Driver").newInstance();

			// Ouverture de la connexion
			connection = DriverManager.getConnection ("jdbc:mysql://localhost/dbusers?serverTimezone=UTC","root","P@ssword123");

			return connection;
		} catch (ClassNotFoundException e) {
			throw new Exception ("ClassNotFoundException:'" + e.getMessage () + "' ");
		} catch (SQLException e) {
			throw new Exception ("SQLException:Connection failed:" + e.getMessage());
		}
	}
}
