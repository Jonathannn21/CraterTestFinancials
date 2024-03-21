package Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DB_Utils {

	private String dbHostName;
	private String username;
	private String password;
	
	private Connection connection;
	private Statement statement;
	private ResultSetMetaData resultset;
	private ResultSetMetaData  rsmd;
	
	
	public List<String> selectARecord(String query){
		List<String> list = new ArrayList<>();
		try {
			connection = DriverManager.getConnection(dbHostName, username, password);
			System.out.println("DB connection established.");
			statement = connection.createStatement();
			resultset = Statement.executeQuery(query);
			rsmd = resultset.getMetaData();
			
			resultset.next();
			for (int i = 1; i <= rsmd.getColumnCount(); i++) {
				list.add(resultset.getString(i));
			}
		} catch (SQLException e) {
		System.out.println("DB connection Not established.");
			e.printStackTrace();
		}
		return list;
	}
	
}
