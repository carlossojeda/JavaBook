package Chapter3;

public class RewritingWithBoolean {
    public static void main(String[] args) {

        boolean newLine = true;

        int count = 0;
        if(count % 10 == 0){
        } else {
            newLine = false;
        }
        System.out.println(newLine);



        int age = 16;
        if(age < 16){
            System.out.println("No drive");
        }
        else  {
            System.out.println("Drive");
        }

    }
}
