
public class ArrayExample {

	public void show () {
		int arr[]= {1,2,3,4,5};
		int arr1[]= {1,2,3,4,5};
		
			if(arr==arr1) {
				System.out.println("both are equal");
			}
			else 
				System.out.println("both are not equal");
		}
	
	
	public static void main(String[] args) {

		ArrayExample a=new ArrayExample();
		a.show();
	}

}
