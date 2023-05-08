import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;


public class ResultDemo {
	public static void main(String[] args) {
		
		String sql = "select * from person";
		try {
		Connection con = JdbcFactory.getConnection();
		Statement stmt = con.createStatement();
		
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()) {
			System.out.println(rs.getString(1) + "\t" + rs.getInt(2) + "\t" + rs.getString(3));
		}
		
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
