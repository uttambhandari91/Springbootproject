package arrayshow;
import java.util.Scanner;

public class BinarytoDecimal {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter a decimal number");
 int num = input.nextInt();
 System.out.println("Decimal number of "+num+" is equal to Binary"+decimal_binary(num));
 }
 
 static int decimal_binary(int n)
 {
     if(n==0)
         return 0;
     else
         return ((n%2)+10*decimal_binary(n/2));
 }
}