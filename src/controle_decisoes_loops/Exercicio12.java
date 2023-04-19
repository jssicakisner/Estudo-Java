package controle_decisoes_loops;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Informe seu salario-hora: ");
            double salarioHora = scan.nextDouble();

            System.out.println("Informe o numero de horas trabalhadas no mes: ");
            double horasTrab = scan.nextDouble();

            double salarioBruto = salarioHora * horasTrab;
            double range1IR = (salarioBruto * 5)/100;
            double range2IR = (salarioBruto * 10)/100;
            double range3IR = (salarioBruto * 20)/100;

            double sindicato = (salarioBruto * 3)/100;
            double fgts = (salarioBruto * 11)/100;
            double inss = (salarioBruto * 10)/100;
            double totalDescontosIsento = sindicato + inss;
            double totalDescontosRange1IR = sindicato + inss + range1IR;
            double totalDescontosRange2IR = sindicato + inss + range2IR;
            double totalDescontosRange3IR = sindicato + inss + range3IR;

            double salarioLiquidoIsento = salarioBruto - totalDescontosIsento;
            double salarioLiquidoRange1IR = salarioBruto - totalDescontosRange1IR;
            double salarioLiquidoRange2IR = salarioBruto - totalDescontosRange2IR;
            double salarioLiquidoRange3IR = salarioBruto - totalDescontosRange3IR;

            if (salarioBruto <= 900) {
                System.out.println("Salário Bruto: " + salarioHora + " * " + horasTrab + " : R$ " + salarioBruto);
                System.out.println("(-) IR: (Isento): R$0,00");
                System.out.println("(-) INSS (10%): R$" + inss);
                System.out.println("(-) Sindicato (3%): R$" + sindicato);
                System.out.println("FGTS (11%): R$" + fgts);
                System.out.println("Total de descontos: R$" + totalDescontosIsento);
                System.out.println("Salário líquido: R$" + salarioLiquidoIsento);
            } else if (salarioBruto <= 1500 && salarioBruto > 900) {
                System.out.println("Salário Bruto: " + salarioHora + " * " + horasTrab + " : R$ " + salarioBruto);
                System.out.println("(-) IR: (5%): R$" + range1IR);
                System.out.println("(-) INSS (10%): R$" + inss);
                System.out.println("(-) Sindicato (3%): R$" + sindicato);
                System.out.println("FGTS (11%): R$" + fgts);
                System.out.println("Total de descontos: R$" + totalDescontosRange1IR);
                System.out.println("Salário líquido: R$" + salarioLiquidoRange1IR);
            } else if (salarioBruto <= 2500 && salarioBruto > 1500) {
                System.out.println("Salário Bruto: " + salarioHora + " * " + horasTrab + " : R$ " + salarioBruto);
                System.out.println("(-) IR: (10%): R$" + range2IR);
                System.out.println("(-) INSS (10%): R$" + inss);
                System.out.println("(-) Sindicato (3%): R$" + sindicato);
                System.out.println("FGTS (11%): R$" + fgts);
                System.out.println("Total de descontos: R$" + totalDescontosRange2IR);
                System.out.println("Salário líquido: R$" + salarioLiquidoRange2IR);
            } else if (salarioBruto > 2500) {
                System.out.println("Salário Bruto: " + salarioHora + " * " + horasTrab + " : R$ " + salarioBruto);
                System.out.println("(-) IR: (20%): R$" + range3IR);
                System.out.println("(-) INSS (10%): R$" + inss);
                System.out.println("(-) Sindicato (3%): R$" + sindicato);
                System.out.println("FGTS (11%): R$" + fgts);
                System.out.println("Total de descontos: R$" + totalDescontosRange3IR);
                System.out.println("Salário líquido: R$" + salarioLiquidoRange3IR);
            }
        }
    }
}
