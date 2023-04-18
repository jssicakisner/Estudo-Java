import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args){
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Informe sua altura em metros: ");
            float altura = scan.nextFloat();

            System.out.println("Informe seu sexo (F/M): ");
            String sexo = scan.next();

        float pesoIdealM = (72.7f * altura) - 58;
        float pesoIdealF = (62.1f * altura) - 44.7f;

        System.out.println("Informe seu peso atual: ");
        float peso = scan.nextFloat();

        //Exercicio feito para maté de Java básico. Não é ideal utilizar esse método de if else para a quantidade de casos deste exercício.
        //O ideal seria utilizar switch case.
        //Além disso esse código só aceita caracteres maiúsculos para a designação de sexo.

        if ((pesoIdealM == peso) && ("M".equals(sexo))){
            System.out.println("Seu peso é ideal.");
        } else if ((pesoIdealM < peso) && ("M".equals(sexo))){
            System.out.println("Você está abaixo do peso ideal.");
        } else if ((pesoIdealM > peso) && ("M".equals(sexo))){
            System.out.println("Você está acima do peso ideal.");
        } else if ((pesoIdealF == peso) && ("F".equals(sexo))){
            System.out.println("Seu peso é ideal.");
        }else if ((pesoIdealF < peso) && ("F".equals(sexo))){
            System.out.println("Você está abaixo do peso ideal.");
        } else if ((pesoIdealF > peso) && ("F".equals(sexo))){
            System.out.println("Você está acima do peso ideal.");
        } else {
            System.out.println("Erro!");
        }
        }

    }
}