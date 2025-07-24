package Chapter3;

public class Precedence {
    public static void main(String[] args) {
        System.out.println(2 * 2 -3 > 2 && 4 - 2 > 5);
        System.out.println(10/2 + 3 * 2 < 15 || 4 + 1 >= 6);
        System.out.println(5 + 6 < 15 || 5 >=6);
        System.out.println(11 < 15 || 5 >= 6);

        System.out.println(5 + 3 * 2 > 10 || 4 * 2 == 8 && 7 - 2 < 3);
        System.out.println(5 + 6 > 10 || 8 == 8 && 5 < 3);
        System.out.println(11 > 10 || 8 == 8 && 5 < 3);

        System.out.println(5 * 2 + 3 < 14 && 10 / 2 + 1 >= 6 || !(4 + 3 == 7 && 2 * 2 == 4));
        System.out.println(10 + 3 < 14 && 5 + 1 >= 6 || !(7 == 7 && 2 * 2 == 4));
        System.out.println(13 < 14 && 6 >= 6 || !(7 == 7 && 2 * 2 == 4));
        System.out.println(true && true || false && false);

        System.out.println(2 * 2 - 3 > 2 && 4 - 2 > 5);
        System.out.println(2 * 2 - 3 > 2 || 4 - 2 > 5);

    }
}
