import java.util.*;

public class MergeDifferentLengthArray {

	public static int[] mergeArr(int[] arr1, int[] arr2) {
		int res[] = new int[arr1.length + arr2.length];
		int i = 0, k = 0, j = 0;
		while (i < arr1.length) {
			res[k] = arr1[i];
			i += 1;
			k += 1;
		}
		while (j < arr2.length) {
			res[k] += arr2[j];
			j += 1;
			k += 1;
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size1 = sc.nextInt();
		int size2 = sc.nextInt();
		int[] arr1 = new int[size1];
		int[] arr2 = new int[size2];
		for (int i = 0; i < size1; i++)
			arr1[i] = sc.nextInt();
		for (int i = 0; i < size2; i++)
			arr2[i] = sc.nextInt();
		int[] mergedArray = mergeArr(arr1, arr2);
		Arrays.sort(mergedArray);
		System.out.println("Arrays after merging: " + Arrays.toString(mergedArray));
		sc.close();

	}

}
