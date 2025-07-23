package Chapter3;

public class TernaryOperator {
    public static void main(String[] args) {
        int x = 5, y;

        if(x > 0){
            y = 1;
        } else {
            y = -1;
        }
        System.out.println(y);


//        Ternary Operator
        y = (x > 0) ? 1: -1;
        System.out.println(y);


//        (boolean expresion) ? expression1 : expression2

        int num1 = 5, num2 = 9;
        int max = (num1 > num2) ? num1 : num2;

        System.out.println(max);

        int num = 26;
        System.out.println((num % 2 == 0) ? "num is even" : "num is odd");


        int n1 = 5, n2 = 9;
        int status = n1 > n2 ? n1 : (n1 == n2? 0: -1);
        System.out.println(status);
    }
}
