package CodeWars.Kata7;

public class Isograms {
    public static boolean isIsograms(String srt) {
        int chars = srt.length();
         System.out.println(chars);
         for(int i = 0; i < chars; i++){
             char currentChar = srt.charAt(i);


             for(int j = 0; j < i; j++){
                 int findingChar = srt.charAt(j);
                 if(findingChar == currentChar){
                      return false;
                 }
             }
         }
         return true;
     }

    public static void main(String[] args) {
        System.out.println(Isograms.isIsograms("kusdbisu"));
        System.out.println(Isograms.isIsograms("Hola"));
    }
}
