package loops;

public class Exercicio16 {
    public static void main(String[] args) {

        int n1 = 1;
        int n2 = 0;

        System.out.println(n2);
        System.out.println(n1);
        
        for (int i = 0; i >= 0; i++) {
            while (n1 <= 500) {
              n1 = n1 + n2;
              n2 = n1 - n2;

            System.out.println(n1);  
            }            
        }
    }
}
