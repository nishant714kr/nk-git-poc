package com.alternative.arraydescriptor;

import java.sql.DriverManager;
import java.sql.Array;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import oracle.jdbc.OracleConnection;


public class DBService {

	private static final String DB_DRIVER = "oracle.jdbc.driver.OracleDriver";
	
	private static final String DB_CONNECTION = "jdbc:oracle:thin:@<host>:<port>/<service_id>";
	private static final String DB_USER = "username";
	private static final String DB_PASSWORD = "password";

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
	
	public static void postChanges(String loginSsoId, String accessSsoId, List<Row> rowListData) throws Exception {
		Connection conn = null;
		conn = getDBConnection();
		Map<String, Class<?>> map = conn.getTypeMap();
	    map.put("TYPE_ROW_OBJ", Row.class);
	    conn.setTypeMap(map);        

	    Array array = ((OracleConnection)conn).createOracleArray("TYPE_ROW_ARR", rowListData.toArray());
	    //Array array = ((OracleConnection)conn).createARRAY("TYPE_ROW_ARR", rowListData.toArray());	// works fine
	    
	    
	    CallableStatement callStmnt = conn.prepareCall("call proc_name(?)");
		callStmnt.setArray(1, array);
		callStmnt.execute();
	}

}