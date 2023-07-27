import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe os valores de A, B e C separados por espaco: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double area_triangulo = ((a*c) / 2);
        double area_circulo = ((Math.pow(c, 2)) * 3.14159);
        double area_trapezio = (((a + b) * c) / 2);
        double area_quadrado = (b * b);
        double area_retangulo = (a * b);

        System.out.printf("TRIANGULO: %.3f%nCIRCULO: %.3f%nTRAPEZIO: %.3f%nQUADRADO: %.3f%nRETANGULO: %.3f%n", area_triangulo, area_circulo, area_trapezio, area_quadrado, area_retangulo);

        sc.close();
    }
}
