package Chapter4;

public class NumericOperatorsOnCharacters {
    public static void main(String[] args) {
        int i = '2' + '3'; // 2 = 50 and 3 = 51;
        System.out.println("i = " + i); // i = 101

        int j = 2 + 'a'; //2 + a = 97;
        System.out.println("j = " + j); // j = 99

        System.out.println(j + " is the Unicode for character " + (char) j);

        int valueOfc = 'c';
        System.out.println("valueOf99 = " + valueOfc);

        System.out.println('c' == 99);

        System.out.println("Chapter " + '2');
    }
}
