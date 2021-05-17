//Q.1 How to find the maximum occurring character in a given string?
import java.util.*;

public class MaxOccuringCharacter {
	
	static final int ASCII_SIZE = 256;
    public static char getMaxOccuringChar(String str) {
        int count[] = new int[ASCII_SIZE];
        int len = str.length();
        for (int i=0; i<len; i++)
            count[str.charAt(i)]++;
        int max = -1;  
        char result = ' '; 
        for (int i = 0; i < len; i++) {
            if (max < count[str.charAt(i)]) {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }
        return result;
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println("Max occuring character is: " + getMaxOccuringChar(s));
		sc.close();

	}

}
