package CodeWars.Kata8;

import static java.lang.Integer.parseInt;

public class ConvertToBinary {
    public static int toBinary(int n){
        String binary = Integer.toBinaryString(n);
        System.out.println(binary);
        return parseInt(binary);
    }


    public static void main(String[] args) {
        System.out.println(toBinary(2));
    }
}
