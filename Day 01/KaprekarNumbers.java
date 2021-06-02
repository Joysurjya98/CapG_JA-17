public class KaprekarNumbers {
	
	public static boolean isKaprekar(int number) {

	      int sq , t, count = 0, firstPart = 0, secondPart = 0, sum = 0;
	      sq = number * number;
	      t = sq;
	      if(number == 1)
	    	  return true;
	      while(t!=0) {
	         count++;
	         t /= 10; 
	      }
	      for(int i=count-1; i>0; i--) {
	    	 firstPart = sq / (int)Math.pow(10, i);
	         secondPart = sq % (int)Math.pow(10, i);
	         if(firstPart == 0 || secondPart == 0)
	        	 continue;
	         sum = firstPart + secondPart;
	         if(sum == number)
	        	 return true;
	      }
	      return false;
	   }

	public static void main(String[] args) {
		int i;
		for(i=0; i<1000; i++) {
			if(isKaprekar(i))
				System.out.println(i + " is a Kaprekar number");
		}
	}

}
