package interfaces_;

public class teste {
    public static void main(String[] args) {
        FiguraGeometrica[] figuras = new FiguraGeometrica[6];
        figuras[0] = new Circulo("Vermelho", 5.0);
        figuras[1] = new Quadrado("Azul", 4.0);
        figuras[2] = new Triangulo("Verde", 3.0, 6.0);
        figuras[3] = new Cubo("Amarelo", 2.0);
        figuras[4] = new Cilindro("Laranja", 2.5, 4.0);
        figuras[5] = new Piramide("Roxo", 3.0, 5.0);

        for (FiguraGeometrica figura : figuras) {
            System.out.println("Figura: " + figura.getNome());
            System.out.println("Cor: " + figura.getCor());

            if (figura instanceof Figura2D) {
                Figura2D figura2D = (Figura2D) figura;
                System.out.println("Area: " + figura2D.calcularArea());
            }
            if (figura instanceof Figura3D) {
                Figura3D Figura3D = (Figura3D) figura;
                System.out.println("Volume: " + Figura3D.calcularVolume());
            }
            System.out.println("-------------------------");
        }
    }
}
