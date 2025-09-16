package Chapter3;

import java.util.Scanner;

public class UsingLogicalOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int userNumber = sc.nextInt();

        boolean isDivisibleAnd = (userNumber % 5) == 0 && (userNumber % 6) == 0;
        System.out.println("isDivisibleAnd = " + isDivisibleAnd);

        boolean isDivisibleOr = (userNumber % 5) == 0 || (userNumber % 6) == 0;
        System.out.println("isDivisibleOr = " + isDivisibleOr);

        boolean isDivisibleNotBoth = (userNumber % 5 ) == 0 ^ (userNumber % 6) == 0;

        System.out.println("isDivisibleNotBoth = " + isDivisibleNotBoth);
    }
}
