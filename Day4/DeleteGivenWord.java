//Q.12  Write a java program to delete a given word from the string?
import java.util.*;

public class DeleteGivenWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String targetword = sc.next();
		if(str.contains(targetword)) {
			str =str.replace(targetword, "");
		}
		System.out.printf("After deleting the word %s new String = %s.", targetword, str);
		sc.close();
	}

}
