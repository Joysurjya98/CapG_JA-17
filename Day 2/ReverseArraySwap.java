import java.util.Scanner;

public class ReverseArraySwap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int arr[]=new int[range];
        for(int i=0;i<range;i++)
        	arr[i] = sc.nextInt();
        for(int i=0;i<range/2;i++){
            arr[i] = arr[i]+arr[range-i-1];
            arr[range-i-1] = arr[i]-arr[range-i-1];
            arr[i] = arr[i] - arr[range-i-1];
        }
        System.out.println("Array in Reverse Form");
        for(int i:arr)
            System.out.print(i+" ");
        sc.close();

	}

}
