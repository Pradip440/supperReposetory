import java.util.Scanner;

public class IntegerToBinery {

		static void showBinery(int[] binery, int id) {
			for(int i=id-1;i>=0;i--) {
				System.out.print(binery[i]+"");
			}
		}
		public static void decimalToBinery(int num) {
			int id=0;
			int[] binary=new int [25];
			while(num>0) {
				binary[id++]=num%2;
				num=num/2;	
			}
			showBinery(binary,id);
		}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int num=sc.nextInt();
		decimalToBinery(num);
		sc.close();
	}

}
