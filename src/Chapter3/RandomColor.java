package Chapter3;

public class RandomColor {
    public static void main(String[] args) {
        int randomNumer = (int)(1 + Math.random() * 7 );
        System.out.println(randomNumer);

        String color = "";
        switch (randomNumer){
            case 1: color = "Violet";
                break;
            case 2: color = "Indigo";
                break;
            case 3: color = "Blue";
                break;
            case 4: color = "Green";
                break;
            case 5:
                color = "Yellow";
                break;
            case 6: color = "Orange";
                break;
            case 7: color = "Red";
                break;
        }
        System.out.println("The selected color is: " + color);
    }
}
