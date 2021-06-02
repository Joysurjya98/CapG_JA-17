import java.util.*;

public class CountDuplicateIntegers {

	public static void main(String[] args) {
		int num, i, j, count=0;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		int[] arr = new int[num];
		for(i=0;i<num;i++)
			arr[i] = sc.nextInt();
		for(i = 0; i < num ; i++) {  
            for(j = i + 1; j < num ; j++) {  
                if(arr[i] == arr[j]) {  
                    System.out.println(arr[j]);
                    count++;
                }
            }
		}
		System.out.println("There are " + count + " duplicate numbers.");
		sc.close();

	}

}
