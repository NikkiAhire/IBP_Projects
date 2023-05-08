import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class ConnectionDemo {
	public static void main(String[] args) {
		String url ="jdbc:mysql://localhost:3306/ibm";
		try {
			
			Connection con = JdbcFactory.getConnection();
			System.out.println("Connected SuccessFully..");
			
			DatabaseMetaData meta = con.getMetaData();
			System.out.println("DB Name : " + meta.getDatabaseProductName());
			System.out.println("DB Ver : " + meta.getDatabaseProductVersion());
			System.out.println("DB : " + meta.getDriverName());
			System.out.println("DB : " + meta.getDriverVersion());
			
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Connected Failed..");
			e.printStackTrace();
		}
		
	}
}
