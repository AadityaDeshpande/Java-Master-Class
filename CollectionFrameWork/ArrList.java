package CollectionFrameWork;

import java.util.ArrayList;

public class ArrList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		ArrayList li = new ArrayList();
		
		li.add(10);
		
		li.add(10.5);
		
		li.add(false);
		
		li.add("aaditya");
		
		if (li.contains("aaditya")) 
		{ 	
			li.remove("aaditya");
		}
		
		li.remove(0);
		
		
		
		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i));
		}
		
		
		ArrayList<String> l2 = new ArrayList<String>();
		
		l2.add("Ram");
		
		l2.add("12");
		
		String [] starr = new String[l2.size()];
		
		//converting it into array
		starr = l2.toArray(starr);
		
		for (String s : starr)
		{
			System.out.println(s);
		}
		
	}

}
