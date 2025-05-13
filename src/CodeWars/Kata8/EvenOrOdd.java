package CodeWars.Kata8;

public class EvenOrOdd {
        public static String evenOrOdd(int number){
            if(number % 2 == 0){
                return "Even";
            }
            else return "Odd";
        }


    public static void main(String[] args) {
        System.out.println(EvenOrOdd.evenOrOdd(1));
    }
}
