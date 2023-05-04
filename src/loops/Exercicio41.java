package loops;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio41 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00");

        System.out.println("Informe o valor da dívida: ");
        double divida = scan.nextDouble();

        System.out.println("Quantidade de Parcelas     % de Juros     Valor da Parcela");
        System.out.println("1                          0              " + df.format(divida / 1));

        for (int parcelas = 3; parcelas <= 12; parcelas += 3) {
            double valorJuros = divida * (parcelas == 3 ? 0.10 : parcelas == 6 ? 0.15 : parcelas == 9 ? 0.20 : 0.25);
            double dividaComJuros = divida + valorJuros;
            double valorParcela = dividaComJuros / parcelas;
            System.out.println(parcelas + "                         " + (int)(valorJuros * 100 / divida) + "%             R$ " + df.format(valorParcela));
        }

        scan.close();       

    }
}
