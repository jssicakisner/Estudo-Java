package basico;
import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args){
        try (Scanner scan = new Scanner(System.in)){
            System.out.println("Insira o valor do salário-hora: ");
            float pagamento = scan.nextFloat();

            System.out.println("Insira o numero de horas trabalhadas no mês: ");
            float horas = scan.nextFloat();

            float salarioBruto = (float) pagamento*horas;
            float inss = (float) (salarioBruto*8)/100;
            float sindicato = (float) (salarioBruto*5)/100;
            float impostoDeRenda = (float) (salarioBruto*11)/100;
            float salarioLiquido = salarioBruto - inss - sindicato - impostoDeRenda;

            System.out.println("O valor do seu salário bruto é: R$" + salarioBruto);
            System.out.println("O valor pago ao INSS é: R$" + inss);
            System.out.println("O valor pago ao sindicato é: R$" + sindicato);
            System.out.println("O salário líquido é: R$" + salarioLiquido);

        }
    }
}
