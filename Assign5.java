/* Practice example 5: Arrays and loops, product discount calculator.

You are given prices of a couple of products and those prices are stored in an array titled “ticket_price”.

This is what the array looks like: int ticket_price[] ={100,150,500,20};



You now need to calculate the discounted price for each item, depending on the percent discount entered by the user.

For example, if the user enters the value of discount percentage as 10, you need to discount the price from the above array by 10%.



You need to store these values inside of a new array and finally print all the elements of the new array which contains the discounted prices.

This is what the output should look like:

90

135

450

18

The mathematical formula for calculating the discounted price is as follows:

Discounted_price = current_price - (current_price * discount_percentage)/100

 */

import java.util.Scanner;

public class Assign5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int discount;
		
		
		int ticket_price[] ={100,150,500,20};
		
		System.out.println("Enter discount percentage");
		discount = sc.nextInt();
		
		int discounted_price[] = new int [ticket_price.length];
		
		for (int i=0 ; i < ticket_price.length; i++) {
			discounted_price[i] = ticket_price[i] - (ticket_price[i]*discount)/100;
		}
		System.out.println("Discount is ");
		for (int key : discounted_price) {
			System.out.println(key);
		}

	sc.close();}

}
