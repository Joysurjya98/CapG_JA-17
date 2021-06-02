//Q.3 Write a to print duplicate characters from the given string?
import java.util.*;

public class DuplicateCharactersInString {

	public static void main(String[] args) {
		int i, j;
		Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char arr[] = str.toCharArray();  
        for( i = 0; i < arr.length; i++) {  
            for(j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j]) {  
                    System.out.println(arr[j]);
                }    
            }
        }
        sc.close();

	}

}
