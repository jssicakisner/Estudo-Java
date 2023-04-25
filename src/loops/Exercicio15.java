package loops;

public class Exercicio15 {
    public static void main(String[] args) {

        int n1 = 1;
        int n2 = 0;

        System.out.println(n2);
        System.out.println(n1);
        
        for (int i = 0; i <= 44; i++ ) {
            n1 = n1 + n2;
            n2 = n1 - n2;

            System.out.println(n1);
        }
    }
}
