import java.util.Scanner;

public class EvenOddSum {

	public static void main(String[] args) {
		int range, evensum=0, oddsum=0, i;
		Scanner sc = new Scanner(System.in);
		range = sc.nextInt();
		int[] arr = new int[range];
		for(i=0; i<range; i++)
			arr[i] = sc.nextInt();
		for (i=0; i<range; i++) {
			if(i%2 == 0)
				evensum += arr[i];
			else
				oddsum += arr[i];
		}
		System.out.println("Sum of even index elements: " + evensum);
		System.out.println("Sum of odd index elements: " + oddsum);
		sc.close();

	}

}
