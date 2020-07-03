import java.util.ArrayList;
import java.util.Iterator;

public class Assign19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> foods = new ArrayList<String>();
		
		foods.add("Cake");
		
		foods.add("Pizza");
		
		foods.add("Burger");
		
		foods.add("Fries");
		
		for(int i = 0 ; i < foods.size(); i++)
		{
			System.out.println(foods.get(i));
		}
		
		System.out.println("*************************************");
		
		for(String str : foods)
		{
			System.out.println(str);
		}
		
		
		System.out.println("*************************************");
		for (Iterator <String> iterator = foods.iterator(); iterator.hasNext();)
		{
			String string = iterator.next();
			System.out.println(string);
		}
		
		
		
	}

}
