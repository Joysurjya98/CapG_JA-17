//Q.7 Find the non repeating character in a given string?
import java.util.*;

public class NonRepeatingCharacters {
	
	public static int frequencyCount(char c,String s) {
		int count=0;
		char chr[]=s.toCharArray();
		for(char i : chr) {
			if(i==c) 
				count++;
		}
		return count;
	}
	
	public static String findNonRepeatingCharacters(String s) {
		char chr[]=s.toCharArray();
		String res="";
		for(char c : chr) {
			if(frequencyCount(c, s)==1)
				res+=c;
		}
		return res;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		String string = sc.next();
		System.out.println("The non repeating characters are: " + findNonRepeatingCharacters(string));
		sc.close();

	}

}
