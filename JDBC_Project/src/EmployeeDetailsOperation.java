import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeDetailsOperation {
	public static Connection conn;
	public static void displayData(Connection c1) {
		conn=c1;
		try {
			Statement stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery("select * from employee");
		while(rs.next()) {
			System.out.println((rs.getInt(1)));
		}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
