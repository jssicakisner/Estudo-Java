package metodos_estaticos;

public class Exercicio04 {
    //Teste classe Conversao de Unidades de Area

    public static void main(String[] args) {
        double metroQuadrado = 100;
        double peQuadrado = ConversaoDeUnidadesDeArea.metroQuadradoToPeQuadrado(metroQuadrado);
        System.out.println(metroQuadrado + " metro(s) quadrado(s) equivale a " + peQuadrado + " pe(s) quadrado(s)");

        double peQuadrado2 = 500;
        double cmQuadrado = ConversaoDeUnidadesDeArea.peQuadradoToCmQuadrado(peQuadrado2);
        System.out.println(peQuadrado2 + " pe(s) quadrado(s) equivale a " + cmQuadrado + " centimetro(s) quadrado(s)");

        double milhaQuadrada = 2;
        double acre = ConversaoDeUnidadesDeArea.milhaQuadradaToAcres(milhaQuadrada);
        System.out.println(milhaQuadrada + " milha(s) quadrada(s) equivale a " + acre + " acre(s)");

        double acre2 = 10;
        double peQuadrado3 = ConversaoDeUnidadesDeArea.acresToPeQuadrado(acre2);
        System.out.println(acre2 + " acre(s) equivale a " + peQuadrado3 + " pe(s) quadrado(s)");
    
    }
}
