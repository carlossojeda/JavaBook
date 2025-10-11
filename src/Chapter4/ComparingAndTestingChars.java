package Chapter4;

public class ComparingAndTestingChars {
    public static void main(String[] args) {
        System.out.println(('a' < 'b')); //True because a (97) is less than b (98)

        System.out.println('a' < 'A'); //False because a (97) is greater than A (65)

        System.out.println('1' < '8'); //True because 1(49) is less than 8 (56)

        int ch = 't';

        if(ch >= 'A' && ch <= 'Z'){
            System.out.println(ch + " is an uppercase letter");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is an lowercase letter");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a numeric character");
        }

        char example1 = '\u345d';
        System.out.println("example1 = " + example1);

        char symbol = '\\';
        System.out.println("symbol = " + symbol);
    }

}
