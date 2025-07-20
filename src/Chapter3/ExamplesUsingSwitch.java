package Chapter3;

public class ExamplesUsingSwitch {
//    What is y after switch is executed and re write the code using if else

    public static void main(String[] args) {
        int x  = 3, y = 3;
        switch (x + 3){
            case 6: y = 1;
                System.out.println(y);
            default: y =+ 1;
                System.out.println(y);
        }

    if (x + 3 == 6){
        y = 1;
    } else {
        y =+1;
    }
        System.out.println(y);

//    What is a after the if else being executed, then change the code to switch

        int a = 1, b = 3;
//        if(b == 1){
//            a+= 5;
//        } else if (b == 2){
//            a += 10;
//        } else if (b == 3) {
//            a += 16;
//        } else if (b == 4) {
//            a += 34;
//        }
//        System.out.println(a);


        switch (b) {
            case 1:
                a += 5;
                break;
            case 2:
                a += 10;
                break;
            case 3:
                a += 16;
                break;
            case 4:
                a += 34;
                break;
        }
        System.out.println(a);
    }



}
