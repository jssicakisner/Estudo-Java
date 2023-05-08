package vetores_arrays;

public class Exercicio21 {
    public static void main(String[] args) {
        int[] vetorA = new int[10];
        int count0 = 0;
        int count1 = 0;

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int) Math.round(Math.random());
        }
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] == 0) {
                count0++;                
            } else {
                count1++;                
            }
        }
        double percent0 = (count0 * 100)/vetorA.length;
        double percent1 = (count1 * 100)/vetorA.length;
        System.out.println();
        System.out.print("O vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();       
        System.out.printf("Percentual de 0's: %.2f%%%n ", percent0);          
        System.out.printf("Percentual de 1's: %.2f%%%n ", percent1);        
    }
}
