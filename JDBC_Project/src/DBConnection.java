import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	static String driver="com.mysql.cj.jdbc.Driver";
	static String url= "jdbc:mysql://localhost:3306/EmployeeDetais";
	static String username="root";
	static String password="Mapapa@8390";
	static Connection conn;
	
	public static Connection connection() {
		try {
			Class.forName(driver);
			System.out.println("Driver loaded");
			try {
				conn= DriverManager.getConnection(url,username,password);
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			System.out.println("connected successfully");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		return conn;
	}
}
