package com.programs.poc.filextract;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DBFileDtlFetcher {

	private static final String DB_DRIVER = "oracle.jdbc.driver.OracleDriver";
	
	// DB Connection ccordinate
	private static final String DB_CONNECTION = "jdbc:oracle:thin:@<host>:<port>/<sid>";
	private static final String DB_USER = "username";
	private static final String DB_PASSWORD = "password";

	public List<FileAttr> collectDocumentDetails() throws SQLException {
		
		List<FileAttr> fileList = new ArrayList<FileAttr>();

		Connection dbConnection = null;
		Statement statement = null;

		String selectTableSQL = "SELECT BINARY_PATH,DOC_ID,FILE_NAME FROM SCHM001.TABLE_NAME";

		try {
			dbConnection = getDBConnection();
			System.out.println("dbConnection["+dbConnection+"]");
			statement = dbConnection.createStatement();

			System.out.println(selectTableSQL);

			// execute select SQL statement
			ResultSet rs = statement.executeQuery(selectTableSQL);

			while (rs.next()) {

				String userid = rs.getString("BINARY_PATH");
				String username = rs.getString("DOC_ID");
				String fileName = rs.getString("FILE_NAME");

				fileList.add(new FileAttr((String)rs.getString("BINARY_PATH"), (String)rs.getString("DOC_ID"), (String)rs.getString("FILE_NAME")));
			}
			return fileList;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return fileList;
		} finally {

			if (statement != null) {
				statement.close();
			}

			if (dbConnection != null) {
				dbConnection.close();
			}

		}
		
	}

	private static Connection getDBConnection() {

		Connection dbConnection = null;

		try {

			Class.forName(DB_DRIVER);

		} catch (ClassNotFoundException e) {

			System.out.println(e.getMessage());

		}

		try {

			dbConnection = DriverManager.getConnection(DB_CONNECTION, DB_USER,
					DB_PASSWORD);
			return dbConnection;

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		}

		return dbConnection;

	}

}