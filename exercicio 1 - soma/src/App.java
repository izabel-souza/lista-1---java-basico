import java.util.Scanner;

public class App {
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe dois inteiros separados por espaco: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.printf("%d + %d = %d%n", x, y, x+y);

        sc.close();
    }
}
