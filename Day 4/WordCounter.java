//Q.9 count number of words in the given string?
import java.util.*;

public class WordCounter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string=sc.nextLine();
		String[] words = string.split(" ");
		System.out.println("There are " + words.length + " words present in the entered string.");
		sc.close();
	}

}
