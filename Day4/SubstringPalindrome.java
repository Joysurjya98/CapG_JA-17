//Q.11 Write a java program to extract a substring and check whether extracted substring is palindrome or not?
import java.util.*;

public class SubstringPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int index = sc.nextInt();
		String substr = str.substring(index-1);
		String reverse ="";
		for(int i=substr.length()-1;i>=0;i--) {
			reverse += substr.charAt(i);
		}
		if(substr.equals(reverse))
			System.out.println("The extracted substring is palindrome.");
		else
			System.out.println("The extracted substring is not palindrome.");
		sc.close();

	}

}
