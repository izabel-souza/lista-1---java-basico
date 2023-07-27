import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe 4 inteiros separados por espaco: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        System.out.printf("A diferenca do produto de (%d e %d) - (%d e %d) = %d%n", a, b, c, d, ((a*b) - (c*d)));

        sc.close();
    }
}
