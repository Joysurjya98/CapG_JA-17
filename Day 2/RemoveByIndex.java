import java.util.*;

public class RemoveByIndex {

	public static int[] removeElement(int[] arr, int size, int index) {
		if (arr == null || index < 0 || index >= size)
			return arr;
		int[] newArr = new int[size-1];
		for (int i= 0, k = 0; i < size; i++) {
			if (i == index) 
				continue;
			newArr[k++] = arr[i];
		}
		return newArr;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		int idx = sc.nextInt();
		arr = removeElement(arr, n, idx);
		System.out.println("Resultant array: " + Arrays.toString(arr));
		sc.close();

	}

}
