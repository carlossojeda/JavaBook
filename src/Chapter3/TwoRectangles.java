package Chapter3;

import java.util.Scanner;

public class TwoRectangles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the center x, y coordinates, width and height of rectangle 1: ");

        double x1 = sc.nextDouble(),
                y1 = sc.nextDouble(),
                width1 = sc.nextDouble(),
                height1 = sc.nextDouble(),
                left1 = x1 - (width1 / 2),
                right1 = x1 + (width1 / 2),
                bottom1 = y1 - (height1 / 2),
                top1 = y1 + (height1 / 2);




        System.out.println("Enter the center x, y coordinates, width and height of rectangle 2: ");

        double x2 = sc.nextDouble(),
                y2 = sc.nextDouble(),
                width2 = sc.nextDouble(),
                height2 = sc.nextDouble(),
                left2 = x2 - (width2 / 2),
                right2 = x2 + (width2 / 2),
                bottom2 = y2 - (height2 / 2),
                top2 = y2 + (height2 / 2);

            if(left2 >= left1 && right2 <= right1 && bottom2 >= bottom1 && top2 <= top1){
                System.out.println(left1);
                System.out.println(left2);
                System.out.println("Inside");
            } else if (right2 >= left1 && left2 <=right1 && top2 >= bottom1 && bottom2 <= top1) {
                System.out.println(right2);
                System.out.println(left1);
                System.out.println("Collide");
            } else System.out.println("Outside");

    }
}
