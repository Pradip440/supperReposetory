package exception1.com;

import java.sql.SQLException;

public class DEmo {

	public static void main(String[] args) {
	show();

	}
	static void show() throws NullPointerException {
		DEmo d =new DEmo() ;
		
		System.out.println(d);
	}

}
