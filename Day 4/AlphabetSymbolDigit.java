//Q.10 Write a java program to check whether at given index is alphabet or symbol or digit?
import java.util.*;

public class AlphabetSymbolDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		str = str.toLowerCase();
		try {
		int i=sc.nextInt();
		if(str.charAt(i-1)>=97 && str.charAt(i-1)<=122)
			System.out.printf("\nIndex %d contains an alphabet.",i);
		else if(str.charAt(i-1)>=48 && str.charAt(i-1)<=57)
			System.out.printf("\nIndex %d contains a digit.",i);
		else
			System.out.printf("\nIndex %d contains a symbol.",i);
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("Index out of Bounds");
		}
		sc.close();

	}

}
