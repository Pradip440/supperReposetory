import java.sql.Connection;

public class EmployeeDetail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DBConnection.connection();
		Connection con =DBConnection.connection();
		EmployeeDetailsOperation.displayData(con);
	}

}
