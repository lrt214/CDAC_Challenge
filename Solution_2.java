import java.util.Scanner;

public class Solution_2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a String ");
		
		String s= new String(sc.nextLine());
		
		System.out.println("Enter no of rows ");
		
		 int n =sc.nextInt();
		System.out.println(convert(s,n));

	}
	
	public static  String convert(String s, int row) {
        int length = s.length();
        
        if (row > length || row<= 1) {
            return s;
        }
        
        char[] arr = new char[length];
        int count = 0;
        
        int val = 2 * row - 2;
        
        for (int i = 0; i < row; i++) {
            int step = val - 2 * i;
            for (int j = i; j < length; j += val) {
                arr[count] = s.charAt(j);
                count++;
                if (step > 0 && step <val && j + step < length) {
                    arr[count] = s.charAt(j + step);
                    count++;
                }                
            }            
        }
        
        return new String(arr);
    }

}
