package Chapter3;

public class TernaryOperatorRewriting {
    public static void main(String[] args) {
        double score;
        double scale = 1.5;
        double x = 2;

        if(x > 10){
            score = (3 * scale);
        } else {
            score = (4 * scale);
        }
        System.out.println(score);


        double income = 1000;
        double tax;

        if(income > 10000){
            tax = income * 0.2;
        } else{
            tax = income * .17 + 1000;
        }
        System.out.println(tax);

        int number = 20;
        if(number % 3 == 0){
            System.out.println("Even");
        } else {
            System.out.println("odd");
        }



    }


}
