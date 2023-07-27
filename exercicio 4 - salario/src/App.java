import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe:");
        System.out.println("numero do funcionario, numero de horas trabalhadas e valor por hora esperados por espaco: ");

        int numero = sc.nextInt();
        int horas_trabalhadas = sc.nextInt();
        double valor_hora = sc.nextDouble();

        double solucao = (valor_hora * horas_trabalhadas);

        System.out.printf("Numero = %d%nSalario = R$p%.2f%n", numero, solucao);
        
        sc.close();
    }
}
