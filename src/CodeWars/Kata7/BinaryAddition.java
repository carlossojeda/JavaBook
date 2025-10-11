package CodeWars.Kata7;

public class BinaryAddition {
    public static String binaryAddition(int a, int b){
//        int add = a + b;
//        StringBuilder binaryNUmber = new StringBuilder();
//
//
//        while (add > 0){
//            binaryNUmber.insert(0, add % 2);
//            add /= 2;
//        }
//
//
//        return String.valueOf(binaryNUmber);


        return Integer.toBinaryString(a + b);
    }

    public static void main(String[] args) {
        System.out.println(binaryAddition(4096, 0));
    }
}

