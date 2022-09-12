package Collection;
import java.util.*;

public class SubArray1{
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
        int sum = 0;
            for(int j = i ; j < n ; j++){
                sum += arr[j];
                if(sum > s){
                    break;
                }
                if(sum == s){
                    a.add(i+1);
                    a.add(j+1);
                    return a;
                }
            }
            
        }
        a.add(-1);
        return a;
    }

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter numbers : ");
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
        	
            int n = sc.nextInt();
            System.out.println(n);
            int s = sc.nextInt();

            int[] m = new int[n];
            for (int j = 0; j < n; j++) {
                m[j] = sc.nextInt();
            }
            
            SubArray1 obj = new SubArray1();
            ArrayList<Integer> res = SubArray1.subarraySum(m, n, s);
            for(int ii = 0;ii<res.size();ii++)
                System.out.print(res.get(ii) + " ");
            System.out.println();
        }
    }

}



