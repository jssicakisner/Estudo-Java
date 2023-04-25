package loops;


public class Exercicio04 {
    public static void main(String[] args) {

        int populacaoA = 80000;
        int populacaoB = 200000;
        int count = 0;
        

        while (populacaoA < populacaoB) {
            populacaoA += ((populacaoA*3)/100);
            populacaoB += ((populacaoB*1.5)/100);
            count++;
        } 
        System.out.println("Populacao A: " + populacaoA);
        System.out.println("Populacao B: " + populacaoB);
        System.out.println("O numero de anos: " + count);

    }
}
