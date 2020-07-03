import java.util.Iterator;
import java.util.TreeSet;

public class Assign20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Students> ts = new TreeSet<>();
		
		Students ram = new Students("Ram", 1, 80.4f);
		Students shyam = new Students("Shyam", 2, 75.6F);
		Students abcd = new Students("abcd", 2, 15.4F);
		Students pqr = new Students("pqr", 2, 65.4F);
		Students asdf = new Students("asdf", 2, 78.2F);
		Students lkjh = new Students("lkjh", 2, 88F);
		
		ts.add(ram);
		ts.add(ram);
		ts.add(ram);
		ts.add(ram);
		ts.add(ram);
		ts.add(ram);
		
		ts.add(shyam);
		ts.add(abcd);
		ts.add(pqr);
		ts.add(asdf);
		ts.add(lkjh);
		
		
		
		for (Iterator<Students> iterator = ts.iterator(); iterator.hasNext();) 
		{
			Students students = (Students) iterator.next();
			students.displayData();
			
		}
		
		
		
	}

}
