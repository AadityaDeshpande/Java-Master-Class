import java.util.Scanner;


public class MyArray {

	public static void main(String[] args) {
		//Declaring array
		int arr[];
		
		arr = new int[10];
		
		// OR 
		// int arr[] = new int[10];
		
		
		int a [][] = new int [3][];
		
		int b[][] = {{1,2,3},{4,5,6}};
		
		for (int[] brr : b) {
			for (int i : brr) {
				System.out.println(i);
			}
		}
		
		
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		System.out.println(num);
//		
//		switch(num) {
//		case 1:System.out.println("in 1");
//			break;
//		case 2:System.out.println("in 2");
//			break;
//		default:System.out.println("in def");
//			break;
//		case 3:System.out.println("in 3");
//			break;
		
		
		}

	}

