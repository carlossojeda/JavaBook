package Projects.Level1;

import java.util.Scanner;

public class UnitsConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Que unidad deseas convertir? \n kilogramos a libras, pulsa 1 \n grados Celsius a Fahrenheit pulsa 2, \n metros a pies pulsa 3");
        int eleccionUsuario = sc.nextInt();
        if(eleccionUsuario == 1){
            System.out.println("Si deseas convertir kilos a libra pulsa 1 \n Si deseas convertir libras a kilos pulsa 2");
            int eleccionKilos = sc.nextInt();
            if(eleccionKilos == 1){
                System.out.println("Ingresa la cantidad de kilos");
                double kilos = sc.nextInt();

                double librasResultado = kilos * 2.20;
                System.out.println(kilos + " kilos son " + librasResultado + " libras");
            }
            else{
                System.out.println("Ingrese la cantidad de libras");
                double librasEleccion = sc.nextDouble();

                double kilosResultado = librasEleccion * .453;
                System.out.println(librasEleccion + " libras son " + kilosResultado + " kilos");
            };

            }
            if (eleccionUsuario == 2){
                System.out.println("Si deseas convertir Grados Celsius a Fahrenheit pulsa 1 \n Si deseas convertir grados Fahrenheit a Celsius pulsa 2");
                int eleccionGrados = sc.nextInt();
                if(eleccionGrados == 1){
                    System.out.println("Ingresa los Grados Celsius a convertir");
                    double celsiusEleccion = sc.nextDouble();

                    double fahrenheitResultado = (celsiusEleccion * 1.8) + 32;
                    System.out.println(celsiusEleccion + " grados celsius son " + fahrenheitResultado + " grados Fahrenheit");
                }
                 else {
                    System.out.println("Ingrese la cantidad de grados Fahrenheit a convertir");
                    double fahrenheitEleccion = sc.nextDouble();

                    double resultadoCelsius = (fahrenheitEleccion - 32) / 1.8;
                    System.out.println(fahrenheitEleccion + " grados Fahrenheit son " + resultadoCelsius + " grados Celsius");
                }
            }
            if(eleccionUsuario == 3) {
                System.out.println("Si desea convertir metros a pies, pulse 1 \n Si desea convertir pies a metros pulse 2");
                int eleccionMedida = sc.nextInt();
                double piesResultado = 0;
                if (eleccionMedida == 1) {
                    System.out.println("Ingrese los metros que desea convertir");
                    double metrosEleccion = sc.nextDouble();

                    piesResultado = metrosEleccion * 3.28;
                    System.out.println(metrosEleccion + " metros son " + piesResultado + " pies");
                } else {
                    System.out.println("Ingrese los pies que desea convertir");
                    double piesEleccion = sc.nextDouble();

                    double metrosResultado = piesEleccion * .304;
                    System.out.println(piesEleccion + " pies son " + metrosResultado + " metros");
                }
            }
        }

    }

