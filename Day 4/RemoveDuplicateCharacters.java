//Q.2 Write a java program to remove all duplicates from a given string?
import java.util.*;

public class RemoveDuplicateCharacters {

	public static String removeDuplicate(String s) {
		char[] str = s.toCharArray();
        int n = str.length;
		int index = 0;
        for (int i = 0; i < n; i++) {
            int j;
            for (j = 0; j < i; j++) {
                if (str[i] == str[j])
                    break;
            }
            if (j == i) 
                str[index++] = str[i];
        }
        return String.valueOf(Arrays.copyOf(str, index));
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println("The resultant string is: " + removeDuplicate(s));
		sc.close();

	}

}
