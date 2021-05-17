//Q.8 how to remove  a given character from a string?
import java.util.*;

public class RemoveParticularCharacter {

	public static String removeChar(String s, char c) {
	    int j, count = 0, n = s.length();
	    char []t = s.toCharArray();
	    for (int i = j = 0; i < n; i++) {
	        if (t[i] != c)
	        	t[j++] = t[i];
	        else
	            count++;
	    }
	    while(count > 0) {
	        t[j++] = '\0';
	        count--;
	    }
	    String str = String.valueOf(t);
	    return str;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string = sc.next();
		char ch = sc.next().charAt(0);
		System.out.printf("New String after removing '%c' is %s.",ch,removeChar(string,ch));
		sc.close();
	}

}
