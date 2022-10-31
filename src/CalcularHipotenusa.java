    import java.util.Scanner;

    public class CalcularHipotenusa {
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("PROGRAMA PARA CALCULAR EL VALOR DE LA HIPOTENUSA");
            System.out.println("Ingrese el valor del Cateto Opuesto: ");
            double a = teclado.nextDouble();
            System.out.println("Ingrese el valor del Cateto Adyacente: ");
            double b = teclado.nextDouble();
            double c = (Math.pow(a,2) + Math.pow(b,2));
            double raiz = (Math.sqrt(c));
            System.out.println("El valor de la Hipotenusa es: " + raiz);


        }
    }
