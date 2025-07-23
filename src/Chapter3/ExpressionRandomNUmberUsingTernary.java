package Chapter3;

public class ExpressionRandomNUmberUsingTernary {
    public static void main(String[] args) {

        double numberRandom1 = Math.random() * 10;
        double numberRandom2 = Math.random() * 10;

        System.out.println(numberRandom1);
        System.out.println(numberRandom2);

        System.out.println((numberRandom1 > numberRandom2) ? 1 : -1);
    }
}
