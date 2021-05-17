//Q.6 How to reverse a String with out using string functions?
import java.util.*;

public class StringReverseWOFunction {
	
	public static String getReverse(String str) {
		String reverse="";
		for(int i=str.length()-1;i>=0;i--)
			reverse += str.charAt(i);
		return reverse;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		String s = sc.nextLine();
		System.out.println("Reverse String : "+getReverse(s));
		sc.close();

	}

}
