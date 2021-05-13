import java.util.Scanner;

public class DuplicateDigits {

	public static void main(String[] args) {
		int num, i ,rem;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		int t = num;
		int a[] = new int[10];
		while(num>0) {
			rem = num % 10;
			a[rem]++;
			num = num / 10;
		}
		for(i=0;i<10;i++) {
			if(a[i] > 1) {
				System.out.println("In number "+ t +" digit "+ i +" is repeated "+ a[i] +" times.");
			}
		}
		sc.close();
	}

}
