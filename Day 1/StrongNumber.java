import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		int i, fact, sum=0, t, rem;
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		t = num;
		while(num>0) {
			rem = num % 10;
			fact = 1;
			for(i=1;i<=rem;i++) {
				fact = fact *i;
			}
			sum = sum+fact;
			num = num/10;
		}
		if(sum == t) {
			System.out.println(t + " is a strong number");
		}
		else {
			System.out.println(t + " is not a strong number");
		}
		sc.close();
	}

}
