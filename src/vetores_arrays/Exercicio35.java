package vetores_arrays;

public class Exercicio35 {
    public static void main(String[] args) {
        
        int[] vetorA = new int[11];

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int) Math.pow(2, i);
            System.out.print(vetorA[i] + " ");
        }    
    }
}
