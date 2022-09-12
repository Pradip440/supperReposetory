package Enum;

enum IceCreams{
			VANILA(2),STAWBERY(4),BUTEERSQUATCH(6) ;
	 int price;
	
	IceCreams(int a){
		price=a;
	}
	void show() {
		
		System.out.println("price of icescrem : "+price );
	}
}

public class Shofty {

	public static void main(String[] args) {
		IceCreams i=IceCreams();
		System.out.println(i);

	}

	private static IceCreams IceCreams() {
		// TODO Auto-generated method stub
		return null;
	}

}
