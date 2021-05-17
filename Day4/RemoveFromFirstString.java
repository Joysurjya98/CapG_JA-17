//Q.4 Write a Java program to remove characters from the first string which are present in the second string?
import java.util.*;

public class RemoveFromFirstString {
	
	static final int NO_OF_CHARS = 256;
	
    public static int[] getCharCountArray(String str) {
        int count[] = new int[NO_OF_CHARS];
        for (int i = 0; i < str.length(); i++)
            count[str.charAt(i)]++;
        return count;
    }

    public static String removeSameChars(String str1, String str2){
        int count[] = getCharCountArray(str2);
        int ip_ind = 0, res_ind = 0;
        char arr[] = str1.toCharArray();
        while (ip_ind != arr.length) {
            char temp = arr[ip_ind];
            if (count[temp] == 0) {
                arr[res_ind] = arr[ip_ind];
                res_ind++;
            }
            ip_ind++;
        }
 
        str1 = new String(arr);
        return str1.substring(0, res_ind);
    }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String string1 = sc.next();
		String string2 = sc.next();
		System.out.println(removeSameChars(string1,string2));
		sc.close();
	}

}
