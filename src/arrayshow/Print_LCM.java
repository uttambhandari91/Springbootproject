package arrayshow;
import java.util.Scanner;

public class Print_LCM {
	public static void main(String[] args) {
        int a, b, t, aTemp, bTemp, lcm, gcd;
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Enter Two Number");
        a = scanner.nextInt();
        b = scanner.nextInt();
 
        gcd = getGcd(a, b);
        /*
         * GCD(a, b) * LCM(a, b) = a*b
         */
        lcm = (a * b) / gcd;
        System.out.println("LCM = " + lcm);
        System.out.println("GCD = " + gcd);
    }
 
    /**
     * Returns LCM and GCD of a and b
     */
    public static int getGcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return getGcd(b, a % b);
        }
    }
}
