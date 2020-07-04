package CollectionFrameWork;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

class MyNumber implements Comparable<MyNumber>
{

	int value;
	
	public MyNumber(int val) {
		// TODO Auto-generated constructor stub
		value = val;
	}
	
	@Override
	public int compareTo(MyNumber o) {
		if (o.value > value)
		{
			return -1;
		}
		else if(o.value < value) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
}


public class treeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		TreeSet<MyNumber> tree = new TreeSet<>();
		
		while(true)
		{
			System.out.println("Enter value: ");
			int num = sc.nextInt();
			
			MyNumber mynum = new MyNumber(num);
			tree.add(mynum);
			
			
			for (Iterator<MyNumber> iterator = tree.iterator(); iterator.hasNext();) {
				MyNumber myNumber = (MyNumber) iterator.next();
				System.out.print(myNumber.value+" ");
			}
			System.out.println();
		}
		
	}

}
