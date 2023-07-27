import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;

        System.out.println("Informe o valor do raio: ");
        double raio = sc.nextDouble();
        double potencia = Math.pow(raio, 2);

        System.out.printf("A area do circulo = %.4f%n", potencia*pi);

        sc.close();
    }
}
