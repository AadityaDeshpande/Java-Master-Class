package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("first");
		ll.add("master");
		ll.add("3rd one");
		
		ll.add(0, "Where ?");
		
		
		for (Iterator<String> iterator = ll.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
			
		}
		
		LinkedList<String> l2 = new LinkedList<String>();
		
		l2.add("lkjh");
		l2.add("abcd");
		l2.add("pqrs");
		
		l2.addAll(1, ll);
		
		for (Iterator<String> iterator = l2.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
		
		List <String> mylist = new ArrayList<String>();
		
		mylist.add("aadi");
		
		mylist.add(1,"asdf");
		
		for (Iterator iterator = mylist.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
		
		
		
	}

}
