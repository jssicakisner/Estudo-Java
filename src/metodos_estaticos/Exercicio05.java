package metodos_estaticos;

public class Exercicio05 {
    //Teste Classe Conversao de Unidades de Volume
    public static void main(String[] args) {
        double litro = 100;
        double centimetrosCubicos = ConversaoDeUnidadesDeVolume.litroToCmCubicos(litro);
        System.out.println("Conversao de 100 Litros em Cm Cubicos: " + centimetrosCubicos);

        double metroCubico = 100;
        double litro1 = ConversaoDeUnidadesDeVolume.metroCubicoToLitros(metroCubico);
        System.out.println("Conversao de 100 Metros Cubicos em Litros: " + litro1);

        double pesCubicos = ConversaoDeUnidadesDeVolume.metroCubicoToPesCubicos(metroCubico);
        System.out.println("Conversao de 100 Metros Cubicos em pes Cubicos: " + pesCubicos);

        double galaoAmericano = 100;
        double polegadasCubicas = ConversaoDeUnidadesDeVolume.galaoAmericanoToPolegadasCubicas(galaoAmericano);
        System.out.println("Conversao de 100 Galões Americanos em Polegadas Cubicas: " + polegadasCubicas);

        double litro2 = ConversaoDeUnidadesDeVolume.galaoAmericanoToLitros(galaoAmericano);
        System.out.println("Conversao de 100 Galoes Americanos em Litros: " + litro2);
    }
}
