public class LucasNumber {

	public static void main(String[] args) {
		int n1 = 2, n2 = 1, n3, i = 1;
		while(i <= 10)
		{
			if(i == 1)
				System.out.println(n1);
			else if(i == 2)
				System.out.println(n2);
			else {
				n3 = n1 + n2;
				System.out.println(n3);
				n1 = n2;
				n2 = n3;
			}
			i++;
		}

	}

}
