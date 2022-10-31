import java.util.Scanner;

public class EcuacionCuadratica {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("PROGRAMA PARA RESOLVER UNA ECUACIÓN CUADRÁTICA APLICANDO LA FORMULA GENERAL");
        System.out.println("Ingrese el valor de a: ");
        double a = teclado.nextDouble();
        System.out.println("Ingrese el valor de b: ");
        double b = teclado.nextDouble();
        System.out.println("Ingrese el valor de c: ");
        double c = teclado.nextDouble();
        double exp = 2;
        double determinante = Math.sqrt(Math.pow(b, exp)-4*a*c);
        System.out.println("Su ecuación no tiene solución en los Reales: ");
        double x1 = (-b + determinante) /(2*a);
        double x2 = (-b - determinante) /(2*a);
        System.out.println("El valor de x1 es: " + x1);
        System.out.println("El valor de x2 es: " + x2);
        }



    }


