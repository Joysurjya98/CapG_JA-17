//Q.15 Write a java program to find repeated words in a given string?
import java.util.*;

public class FindRepeatedWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String words[] = str.split(" ");
		for(int i=0; i<words.length; i++) {
			for(int j=i+1; j<words.length; j++) {
				if(words[i].equalsIgnoreCase(words[j])) {
					System.out.print(words[j]+" ");
					break;
				}
			}
		}
		sc.close();
	}

}
