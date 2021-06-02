import java.util.*;

public class CountDuplicateCharacters {

	public static void main(String[] args) {
		int num, i, j, count=0;
		Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        char arr[] = new char[num];
        for(i=0;i<num;i++)
        	arr[i] = sc.next().charAt(0);         
        for( i = 0; i < num; i++) {  
            for(j = i + 1; j < num; j++) {  
                if(arr[i] == arr[j]) {  
                    System.out.println(arr[j]);
                    count++;
                }    
            }
        }
        sc.close();

	}

}
