import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionDemo {
	public static void main(String[] args) {
		
		String sql1 = "insert into person values ('Ben',50,'Bengaluru')";
		String sql2 = "update person set age=22 where namw='polo'";
		String sql3 = "delete from person where namw='Neil'";
		Connection con =null;
		try {
			con = JdbcFactory.getConnection();
			con.setAutoCommit(false);
			
			Statement stmt = con.createStatement();
			stmt.addBatch(sql1);
			stmt.addBatch(sql2);
			stmt.addBatch(sql3);
			
			stmt.executeBatch();
			con.commit();
			System.out.println("Transaction Completed ...");
		}
		catch(SQLException e) {
			System.out.println("Transaction Failes due to......");
			e.printStackTrace();
			try {
				con.rollback();
			} catch(SQLException e1) {
				e.printStackTrace();
			}
		}
	}
}
