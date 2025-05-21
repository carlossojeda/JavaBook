package CodeWars.Kata8;

public class DrinkAbout {
    public static String peopleWithAgeDrink(int age){
        String message = "";

        if(age < 14){
            message = "drink toddy";

        }
        else if (age < 18){
            message = "drink coke";
        }
        else if (age < 21){
            message = "drink beer";
        }
        else {
            message = "Drink whisky";
        }
        return message;
    }

    public static void main(String[] args) {
        System.out.println(peopleWithAgeDrink(21));
    }
}
