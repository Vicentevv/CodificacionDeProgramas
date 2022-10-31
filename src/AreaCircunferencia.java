import java.util.Scanner;

public class AreaCircunferencia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("PROGRAMA PARA CALCULAR EL AREA DE UNA CIRCUNFERENCIA");
        System.out.println("Ingrese el valor del radio: ");
        double radio = teclado.nextDouble();
        double area = (Math.PI* Math.pow(radio,2));
        System.out.println("El area de la circunferencia es: " + area);

    }
}
