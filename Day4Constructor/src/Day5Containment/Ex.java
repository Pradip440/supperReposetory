package Day5Containment;

import java.util.Arrays;

//code illustrating shallow copy
public class Ex {

	  private int[] data;

	  // makes a shallow copy of values
	  public Ex(int[] values) {
	    data = values;
	  }

	  public void showData() {
	    System.out.println( Arrays.toString(data) );
	  }
	  
    public static void main(String[] args) {
        int[] vals = {3, 7, 9};
        Ex e = new Ex(vals);
        e.showData(); // prints out [3, 7, 9]
        vals[0] = 13;
        e.showData(); // prints out [13, 7, 9]
  
        // Very confusing, because we didn't
        // intentionally change anything about 
        // the object e refers to.
    }
}
//Code explaining deep copy
//public class Ex {
//
//private int[] data;
//
//// altered to make a deep copy of values
//public Ex(int[] values) {
// data = new int[values.length];
// for (int i = 0; i < data.length; i++) {
//   data[i] = values[i];
// }
//}
//
//public void showData() {
// System.out.println(Arrays.toString(data));
//}
//
//
//	  public static void main(String[] args) {
//	    int[] vals = {3, 7, 9};
//	    Ex e = new Ex(vals);
//	    e.showData(); // prints out [3, 7, 9]
//	    vals[0] = 13;
//	    e.showData(); // prints out [3, 7, 9]
//
//	  // changes in array values will not be
//	  // shown in data values.
//	  }
//}
