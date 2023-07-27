import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe - peca 1: ");
        System.out.println("Codigo da peca, o numero de pecas e o valor da unidade separados por espaco: ");
        int codigo_peca1 = sc.nextInt();
        int numero_peca1 = sc.nextInt();
        double valor_peca1 = sc.nextDouble();

        System.out.println("Informe - peca 2: ");
        System.out.println("Codigo da peca, o numero de pecas e o valor da unidade separados por espaco: ");

        int codigo_peca2 = sc.nextInt();
        int numero_peca2 = sc.nextInt();
        double valor_peca2 = sc.nextDouble();

        System.out.printf("VALOR A PAGAR: R$%.2f%n", ((numero_peca1*valor_peca1)+(numero_peca2*valor_peca2)));

        sc.close();
    }
}
