package metodos_estaticos;

public class ConversaoDeUnidadesDeVolume {
    public static final double LITRO_TO_CENTIMETROS_CUBICOS = 1000;
    public static final double METRO_CUBICO_TO_LITROS = 1000;
    public static final double METRO_CUBICO_TO_PES_CUBICOS = 35.32;
    public static final double GALAO_AMERICANO_TO_POLEGADAS_CUBICAS = 231;
    public static final double GALAO_AMERICANO_TO_LITROS = 3785;

    public static double litroToCmCubicos(double litro) {
        return litro * LITRO_TO_CENTIMETROS_CUBICOS;
    }
    public static double metroCubicoToLitros(double metroCubico) {
        return metroCubico * METRO_CUBICO_TO_LITROS;
    }
    public static double metroCubicoToPesCubicos(double metroCubico) {
        return metroCubico * METRO_CUBICO_TO_PES_CUBICOS;
    }
    public static double galaoAmericanoToPolegadasCubicas(double galaoAmericano) {
        return galaoAmericano * GALAO_AMERICANO_TO_POLEGADAS_CUBICAS;
    }
    public static double galaoAmericanoToLitros(double galaoAmericano) {
        return galaoAmericano * GALAO_AMERICANO_TO_LITROS;
    }
}
