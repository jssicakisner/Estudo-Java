package basico;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args){
        try (Scanner scan = new Scanner(System.in)){
            System.out.println("Insira o valor do salário-hora: ");
            double pagamento = scan.nextDouble();

            System.out.println("Insira o numero de horas trabalhadas no mês: ");
            double horas = scan.nextDouble();

            double salario = pagamento*horas;

            System.out.println("O valor do seu salário é: " + salario);

        }

    }
}
