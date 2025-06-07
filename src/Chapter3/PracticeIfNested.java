package Chapter3;

public class PracticeIfNested {
    public static void main(String[] args) {
        int x = 1;
        int y = 3;

        if(x > 2){
            if(y > 2){
                int z = x + y;
                System.out.println("z is:  " + z);
            }
            else System.out.println("x is = " + x);
        }

    }
}
