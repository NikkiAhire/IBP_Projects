
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sql = "insert into person values('Neil',22,'Nashik')";
		
		try {
			Connection con = JdbcFactory.getConnection();
			Statement stmt = con.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("Record Inserted..");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
