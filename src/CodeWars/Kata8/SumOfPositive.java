package CodeWars.Kata8;

public class SumOfPositive {
    public static int sum(int[] arr){

        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] > 0){
                sum += arr[i];
            }
        }

        return sum;
    }


    public static void main(String[] args) {
        System.out.println(sum(new int[]{1, 3, 4, 5, -2,}));
    }
}
