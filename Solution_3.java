import java.util.*;

public class Solution_3 {

	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter a String ");
	
	String s= new String(sc.nextLine());
	 
	System.out.println(last(s));
	
	
	}
	
	public static int last(String str) {
        int length = 0;
        String[] words = str.split(" ");
        if(words.length>0) {
            length = words[words.length-1].length();			
        } else {
            length = 0;
        }
        return length;
    }
	 
}
