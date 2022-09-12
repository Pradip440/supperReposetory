
public class Camera {
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
	 
 }
 //inventry
 public static void main(String [] args)
 {
	 Camera i = new Camera ();
	 i.acceptcameraDetaail("nikon","black",8);
	 i.showDetail();
	 
 }
}
