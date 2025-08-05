import java.util.Scanner;

public class FunctionCalculation {
    public static void main(String[] args) {
        //It can't be greater than 20! because I didn't use BigInteger
        //Doesn't work with negative values either
        Scanner scan =new Scanner(System.in);
        long a = scan.nextInt();
        long b;
        long c;
        c = a;
        while (a > 1) {
            a--;
            b = a;
            c = c * b;
        }
        System.out.println(c);
    }
}