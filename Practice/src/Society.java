
public class Society {
	String SName;
	String SAddress;
	int x=300;
	Society(){}
	Society(String n,String a){
		SName =n;
		SAddress=a;
	}
	void showSocietyDetail() {
		System.out.println("society name is :" + SName);
		System.out.println("society address is " + SAddress);
	}
	class Flat{
		int x=100;
		int FlatNO;
		int floarNo;
		Flat(){}
		Flat(int a,int b){
			FlatNO=a;
			floarNo=b;
		}
		void showFlatDetail() {
			int x=200;
			Society.Audite.Name="nupur";
			System.out.println("flat number is : " + FlatNO);
			System.out.println("flat at "+floarNo+ " floar");
			System.out.println("local variable x = "+x);
			System.out.println("flat x = "+this.x);
			System.out.println("Society x =  "+Society.this.x);
		}
	}
	static class Audite{
		static String Name="nupur";
		static int date;
		Audite(String s,int d){
			Name=s;
			date=d;
	     }
		public static void show() {
			System.out.println("auditer name : "+ Name);
			System.out.println("audite in  :"+ date);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Society s=new Society("gokuldham","goregoan");
		Society.Flat s1=s.new Flat(41,6);
		s1.showFlatDetail();
		Audite a=new Audite("Nupur", 12_8);
		Society.Audite.show();
	}

}
