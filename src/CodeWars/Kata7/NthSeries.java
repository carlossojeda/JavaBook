package CodeWars.Kata7;

public class NthSeries {
    public static String seriesSum(int n) {
        int dividendo;
        double sum = 0;
        double result = 0;

            if(n <= 0){
                return "0.00";
            }


        for (int i = 1; i <= n; i++) {
            dividendo = 1 + 3 * (i - 1);

            //System.out.println("dividendo = " + dividendo);

            double divisor = (double) 1 / dividendo;
            //System.out.println("divisor = " + divisor);

            sum += divisor * 1;
            //System.out.println("sum = " + sum );

           // result = Double.parseDouble(String.format("%.2f", sum));




        }

        return String.format("%.2f", sum);

    }

    public static void main(String[] args) {
        System.out.println(NthSeries.seriesSum(58));
    }
}
