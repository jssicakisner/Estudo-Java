package loops;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {

            boolean senhaValida = false;
            String usuario;
            String senha;

            do {
                System.out.println("Informe seu nome de usuario: ");
                usuario = scan.next();

                System.out.println("Informe sua senha: ");
                senha = scan.next();

                if (usuario.equals(senha)) {
                    senhaValida = false;
                    System.out.println("A senha nao pode ser igual ao nome de usuario!");
                } else {
                    senhaValida = true;
                    System.out.println("Usuario e senha cadastrados!");
                }

            } while (!senhaValida);
        }
    }
}
