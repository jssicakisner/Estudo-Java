package loops;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        
        try (Scanner scan = new Scanner(System.in)) {
            boolean infoValida = false;
            String nome;
            int idade;
            double salario;
            String sexo;
            String estadoCivil;

            do {
                System.out.println("Informe seu Nome: ");
                nome = scan.next();

                if (nome.length() > 3) {
                    infoValida = true;
                    System.out.println("Nome: " + nome);
                } else {                
                    System.out.println("O nome precisa ter mais que 3 caracteres!");
                }

            } while (!infoValida);

            infoValida = false;
            do {
                System.out.println("Informe sua idade: ");
                idade = scan.nextInt();

                if (idade >= 0 && idade <= 150) {
                    infoValida = true;
                    System.out.println("Idade: " + idade);
                } else {
                    System.out.println("Informe uma idade válida!");
                }

            } while (!infoValida);

            infoValida = false;
            do {
                System.out.println("Informe o seu salário: ");
                salario = scan.nextDouble();

                if (salario > 0) {
                    infoValida = true;
                    System.out.println("Salário: " + salario);
                } else {
                    System.out.println("Informe um valor válido!");
                }

            } while (!infoValida);

            infoValida = false;
            do {
                System.out.println("Informe o sexo (F/M): ");
                sexo = scan.next();

                if (sexo.equalsIgnoreCase("F") || sexo.equalsIgnoreCase("M")) {
                    infoValida = true;
                    System.out.println("Sexo: " + sexo);
                } else {
                    System.out.println("Informe um valor válido!");
                }

            } while (!infoValida);

            infoValida = false;
            do {
                System.out.println("Informe seu estado civil ('s', 'c', 'v', 'd'): ");
                estadoCivil = scan.next();

                if (estadoCivil.equalsIgnoreCase("S") || estadoCivil.equalsIgnoreCase("C") || estadoCivil.equalsIgnoreCase("V") || estadoCivil.equalsIgnoreCase("D")) {
                    infoValida = true;
                    System.out.println("Estado Civil: " + estadoCivil);
                } else {
                    System.out.println("Informe um valor válido!");
                }

            } while (!infoValida);
        }


    }
}
