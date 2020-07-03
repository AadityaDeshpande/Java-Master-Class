package CollectionFrameWork;

import java.util.HashSet;
import java.util.Iterator;

public class MyHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("aaditya");
		hs.add("alex");
		hs.add("Master");
		hs.add("John");
		hs.add("Java");
		hs.add("Last");
		
		Iterator<String> itr = hs.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}

}
