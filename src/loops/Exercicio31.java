package loops;

import java.util.Scanner;

public class Exercicio31 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            double quantProdutos;
            double valorProduto;
            double valorTotal = 0;
            double troco;
            double dinheiroPago = 0;
            boolean valido = false;

            System.out.println("Informe a quantidade de Produtos: ");
                quantProdutos = scan.nextDouble();

                for (int i = 1; i <= quantProdutos; i++) {

                    do {
                        System.out.println("Informe o valor do Produto " + i + ": ");
                        valorProduto = scan.nextDouble();

                        if (quantProdutos > 0) {
                            valido = true;
                        } else {
                            System.out.println("Informe um valor válido!");
                            valido = false;
                        }
                    } while (!valido);

                    valorTotal +=  valorProduto;  
                    
                    System.out.println("Produto " + i + ": R$" + valorProduto);
                    
                }
                    System.out.println("O valor total da compra: R$" + valorTotal);  

                    System.out.println("Informe o valor em dinheiro fornecido pelo cliente: ");
                    dinheiroPago = scan.nextDouble();

                    troco = dinheiroPago - valorTotal;
                    System.out.println("O troco a ser devolvido é: R$" + troco);
        }
    }
}
