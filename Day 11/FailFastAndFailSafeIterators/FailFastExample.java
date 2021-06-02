import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastExample {

	public static void main(String[] args) {
		ArrayList<String>names = new ArrayList<String>();
		names.add("Rama");
		names.add("Rama1");
		names.add("Ram");
		names.add("Ramji");
		names.add("Raamaa");
		try {
			//printing the values of the ArrayList
			System.out.println("Names in the ArrayList: ");
			Iterator<String>itr = names.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
				System.out.println("adding an element in between the iteration");
				names.add("Krishna");
			}
		}catch(Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}finally {
			System.out.println("finally block");
		}
		
		// Using CopyOnWriteArrayList to avoid ConcurrentModificationException
		
		CopyOnWriteArrayList<String>names1 = new CopyOnWriteArrayList<String>();
		names.add("Rama");
		names.add("Rama1");
		names.add("Ram");
		names.add("Ramji");
		names.add("Raamaa");
		try {
			//printing the values of the ArrayList
			System.out.println("Names in the ArrayList: ");
			Iterator<String>itr = names1.iterator(); //fail safe iterator
			while(itr.hasNext()) {
				System.out.println(itr.next());
				System.out.println("adding an element in between the iteration");
				names.add("Krishna");
			}
		}catch(Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}finally {
			System.out.println("finally block");
		}

	}

}
