package metodos_estaticos;

public class ConversaoDeUnidadesDeArea {
    private static final double METRO_QUADRADO_TO_PE_QUADRADO = 10.76;
    private static final double PE_QUADRADO_TO_CENTIMETRO_QUADRADO = 929;
    private static final double MILHA_QUADRADA_TO_ACRES = 640;
    private static final double ACRES_TO_PE_QUADRADO = 43560;

    public static double metroQuadradoToPeQuadrado(double metroQuadrado) {
        return metroQuadrado * METRO_QUADRADO_TO_PE_QUADRADO;
    }
    public static double peQuadradoToCmQuadrado(double peQuadrado) {
        return peQuadrado * PE_QUADRADO_TO_CENTIMETRO_QUADRADO;
    }
    public static double milhaQuadradaToAcres(double milhaQuadrada) {
        return milhaQuadrada * MILHA_QUADRADA_TO_ACRES;
    }
    public static double acresToPeQuadrado(double acre) {
        return acre * ACRES_TO_PE_QUADRADO;
    }
}