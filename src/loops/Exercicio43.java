package loops;

import java.util.Scanner;

public class Exercicio43 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            String interacao;
            int codigo;
            int quantidade = 0;
            double preco = 0;
            double soma = 0;
            String item = "";

            while (true) {
                System.out.println("Gostaria de adicionar itens ao carrinho? (S/N)");
                interacao = scan.next();
                if (interacao.equalsIgnoreCase("N")) {
                    break;
                }
                System.out.println("Informe um codigo de item: ");
                codigo = scan.nextInt();

                System.out.println("Informe a quantidade de itens: ");
                quantidade = scan.nextInt();       

                if (codigo == 100) {
                    preco = quantidade * 1.2;
                    item = "Cachorro Quente";
                }
                if (codigo == 101) {
                    preco = quantidade * 1.3;
                    item = "Bauru Simples";
                }
                if (codigo == 102) {
                    preco = quantidade * 1.5;
                    item = "Bauru com ovo";
                }
                if (codigo == 103) {
                    preco = quantidade * 1.2;
                    item = "Hambúrguer";
                }
                if (codigo == 104) {
                    preco = quantidade * 1.3;
                    item = "Cheeseburguer";
                }
                if (codigo == 105) {
                    preco = quantidade * 1;
                    item = "Refrigerante";     
                }            
                soma += preco;
                System.out.println("Item: " + item);
                System.out.println("Preco: " + preco);
                System.out.println("Quantidade: " + quantidade);
            }

            System.out.println("O preco total é: " + soma);
        }
    } 
} 