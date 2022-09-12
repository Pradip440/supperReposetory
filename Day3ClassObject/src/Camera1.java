
public class Camera1 {
	int camera;
	 String brand,color;
	 public void acceptcameraDetaail ( String nikon, String black,int cam)
	 {
		 this.camera=cam;
		      brand=nikon;
		      color=black;	 
	 }

	 public  void showDetail()
	 {
		 System.out.println("camera brand is  : " +"nikon");
		 System.out.println("camera in color is : " +"black");
		 System.out.println("camera in MP is : " +8);
		 System.out.println("___________________________________________ ");
	 }
	 //inventry
	 public static void main(String [] args)
	 {
		 Camera1 i = new Camera1 ();
		 i.acceptcameraDetaail("nikon","black",8);
		 i.showDetail();
		 Camera1 i1=new Camera1();
		 i1.showDetail();
		 i1.camera=i.camera;
		 i1.brand=i.brand;
		 i1.color=i.color;
		 Camera1 i2=new Camera1();
		 i2=i;
		 i2.showDetail();
		 System.out.println("hash code of i is : "+ i.hashCode());
		 System.out.println("hash code of i1 is : "+ i1.hashCode());
		 System.out.println("hash code of i2 is : " + i2.hashCode());
	 }
}
