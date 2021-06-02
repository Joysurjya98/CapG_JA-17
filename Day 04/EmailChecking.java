//Q.14 Write a java program to check given email contains @ and .?
import java.util.*;

public class EmailChecking {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String email = sc.next();
		if(email.contains("@") && email.contains("."))
			System.out.println("Email contains both '@' and '.'");
		else if(email.contains("@"))
			System.out.println("Email contains '@' but not '.'");
		else if(email.contains("."))
			System.out.println("Email contains '.' but not '@'");
		else
			System.out.println("Email does not contain both '@' and '.'");
		sc.close();
	}

}
