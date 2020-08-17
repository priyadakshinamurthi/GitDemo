package CompleteProgram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnectionTest {

	public static void main(String[] args) throws SQLException{
		// TODO Auto-generated method stub

		String host="localhost";
		String port="3306";
		Connection c = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/qadb","priya","priya");
		Statement s = c.createStatement();
		ResultSet r = s.executeQuery("select * from test");
		while(r.next())
		{
			System.out.println(r.getString("location"));
		}
		
		
	}

}
