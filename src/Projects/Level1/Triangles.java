package Projects.Level1;

public class Triangles {
    public static void main(String[] args) {
        int n = 5;
        int espaciosEnBlanco = n-1;
        int asteriscos = 1;

        for (int filas = 1; filas <= n; filas++){
            for (int columnaVacia = 1; columnaVacia <= espaciosEnBlanco; columnaVacia++){
                System.out.print(" ");
            }
            for(int columna = 1; columna <= asteriscos; columna++){
                System.out.print("*");
            }
            espaciosEnBlanco--;
            asteriscos+=2;
            System.out.println();
        }
    }
}
