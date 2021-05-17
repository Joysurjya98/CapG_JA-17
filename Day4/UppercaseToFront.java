//Q.13 Write a java program to read a string and move all upper case characters to front?
import java.util.*;

public class UppercaseToFront {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String newstr = "";
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)>=65 && str.charAt(i)<=90) 
				newstr += str.charAt(i);
		}
		for(int i=0; i<str.length(); i++) {
			if(!(str.charAt(i)>=65 && str.charAt(i)<=90))
				newstr += str.charAt(i);
		}
		System.out.println("The resultant string is: " + newstr);
		sc.close();

	}

}
