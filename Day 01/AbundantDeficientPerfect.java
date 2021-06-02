import java.util.Scanner;

public class AbundantDeficientPerfect {

	public static void main(String[] args) {
		int num,i;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		if(num == 1) {
			System.out.println(num + " is neither abundant nor deficient nor perfect number");
		}
		else {
			int sum=0;
			for(i=1;i<=(num/2);i++) {
				if(num % i==0)
				sum += i;
			}
			if(sum == num)
				System.out.println(num + " is a Perfect number \n");
			else if(sum < num)
				System.out.println(num + " is a Deficient number \n");
			else
				System.out.println(num + " is an Abundant number \n");
		}
		sc.close();

	}

}
