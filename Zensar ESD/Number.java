class Number {

public static void main(String [] args){

int  n1=00001100;
int  n2=11000101;

int a=5;
int b=10;
int c=15;
System.out.println("n1&n2= "+ (n1&n2) );
System.out.println("n1|n2= "+ (n1|n2) );
System.out.println("n1>>2= "+ (n1>>2) );

/*int temp;
temp=a>b ? return a; : return b;*/

int result = (a > b) ? a : b;

int result2 = (a > b) ? (a > c) ? a : c : (b > c) ? b : c;

System.out.println(result2);

System.out.println((a > b) ? (a > c) ? a : c : (b > c) ? b : c);

String s = "abcd";

boolean flag = s instanceof Double;
System.out.println(flag);




}
}
