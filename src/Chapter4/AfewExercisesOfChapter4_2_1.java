package Chapter4;

public class AfewExercisesOfChapter4_2_1 {
    public static void main(String[] args) {
        double resultInRadians = Math.toRadians(47);
        System.out.println("resultInRadians = " + resultInRadians);

        double resultInDegrees = Math.toDegrees((Math.PI / 7));
        System.out.println("resultInDegrees = " + resultInDegrees);

        int randomNumber1 =  34 + (int) (Math.random() * 22);
        System.out.println("randomNumber1 = " + randomNumber1);

        int randomNumber2 = (int) (Math.random() * 1000);
        System.out.println("randomNumber2 = " + randomNumber2);

        double randomNumber3 = (5.5 + (Math.random() * 50));
        System.out.println("randomNumber3 = " + randomNumber3);


        System.out.println("Math.log(Math.exp(5.5)) = " + Math.log(Math.exp(5.5)));
        System.out.println("Math.exp(Math.log(5.5)) = " + Math.exp(Math.log(5.5)));

        System.out.println("Math.asin(Math.sin(Math.PI / 6)) = " + Math.asin(Math.sin(Math.PI / 6)));
        System.out.println("Math.sin(Math.asin(Math.PI / 6)) = " + Math.sin(Math.asin(Math.PI / 6)));

        System.out.println("\"\\u6B22\\u8FCE.q\"  = " + "\u6B22\u8FCE" );
        

        char ch = (char) 65.25;
        System.out.println("ch = " + ch);

        int i = (int) 'A';
        System.out.println("i = " + i);

//        byte b = '\uFFF4';
        byte b = (byte) '\uFFF4';
        System.out.println("b = " + b);
    }
}
