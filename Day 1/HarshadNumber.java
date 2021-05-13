import java.util.Scanner;

public class HarshadNumber {

	public static void main(String[] args) {
		int num, i, j, sum=0;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		i = num;
		while(i > 0)
		{
			j = i % 10;
			sum = sum + j;
			i = i / 10;
		}
		if(num % sum == 0)
			System.out.println(num + " is a Harshad Number.");
		else
			System.out.println(num + " is not a Harshad Number.");  
		sc.close();
	}

}
