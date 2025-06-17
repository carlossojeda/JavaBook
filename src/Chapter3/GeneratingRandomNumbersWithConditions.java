package Chapter3;

public class GeneratingRandomNumbersWithConditions {
    public static void main(String[] args) {
        int numBet0y20 = (int) (Math.random() * 20);
        System.out.println(numBet0y20);

        int numBeth10y20 = (int) (10 + (Math.random() * 10));
        System.out.println(numBeth10y20);

        int numBeth10y50 = (int) (10 + Math.random() * 41);
        System.out.println(numBeth10y50);


        int zeroOrOne = (int) (Math.random() * 2);
        System.out.println(zeroOrOne);
    }
}
