import java.util.*;

public class Solution_1 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Length of Array");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		
		System.out.println("Enter element into array Array");
		for(int i=0; i<arr.length;i++) {
			arr[i]=sc.nextInt();	
		}
		
		System.out.println(subarray(arr));
		
		
	}
	
	
	public  static int subarray(int[] arr) {
	    int n = arr.length;
	    int left = 0;
	    int rigth = n - 1;
	    while(left + 1 < n && arr[left] <= arr[left + 1]){
	        left++;
	    }
	    while(rigth - 1 >= 0 && arr[rigth] >= arr[rigth - 1]){
	        rigth--;
	    }
	    if(left >= rigth) return 0;
	    int max = Math.max(left + 1, rigth - left);
	    for(int i = 0; i <= left; i++){
	        for(int j = rigth; j < n; j++){
	            if(arr[j] >= arr[i]){
	                max = Math.max(i + 1 + n - j, max);
	                break;
	            }
	        }
	    }
	    return n - max;
	}


}
