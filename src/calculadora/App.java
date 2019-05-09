package calculadora;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int n1, n2, resultado;
        int opcion;
        boolean op = true;
        Calculadora cal = new Calculadora();
        Scanner entrada = new Scanner(System.in);

        while (op) {

            System.out.println("1.Sumar ");
            System.out.println("2.Restar  ");
            System.out.println("3.Multiplicar ");
            System.out.println("4.Dividir");
            System.out.println("5.Salir");
            System.out.println(" Seleccione una opción");
            opcion = entrada.nextInt();

            if (opcion == 5) {

                System.out.println("Gracias ");
                break;

            } else {

                switch (opcion) {

                    case 1:
                        System.out.println("Ingrese el primer numero");
                        n1 = entrada.nextInt();
                        System.out.println(" Ingrese el segundo numero");
                        n2 = entrada.nextInt();

                        resultado = cal.sumar(n1, n2);
                        System.out.println(" La suma es: " + resultado);
                        break;
                    case 2:

                        System.out.println("Ingrese el primer numero");
                        n1 = entrada.nextInt();
                        System.out.println(" Ingrese el segundo numero");
                        n2 = entrada.nextInt();

                        resultado = cal.restar(n1, n2);
                        System.out.println(" La resta es: " + resultado);
                        break;

                    case 3:

                        System.out.println("Ingrese el primer numero");
                        n1 = entrada.nextInt();
                        System.out.println(" Ingrese el segundo numero");
                        n2 = entrada.nextInt();
                        resultado = cal.multiplicar(n1, n2);
                        System.out.println(" La multiplicacion es: " + resultado);
                        break;

                    case 4:

                        try {
                            System.out.println("Ingrese el primer numero");
                            n1 = entrada.nextInt();
                            System.out.println(" Ingrese el segundo numero");
                            n2 = entrada.nextInt();
                            resultado = cal.division(n1,n2);
                            System.out.println(" La division es: " + resultado);

                        } catch (ArithmeticException a) { 

                            System.out.println("No se puede dividir en cero!!");

                        }
                        break;

                    default:
                        System.out.println("Opcion invalida");

                }
            }

        }

    }

}
