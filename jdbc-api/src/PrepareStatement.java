import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class PrepareStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sql = "insert into person values(?,?,?)";
		try {
			Connection con = JdbcFactory.getConnection();
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setString(1,args[0]);
			stmt.setInt(2,Integer.parseInt(args[1]));
			stmt.setString(3,args[2]);
			
			stmt.executeUpdate();
			System.out.println("....  Record Inserted  ....");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
