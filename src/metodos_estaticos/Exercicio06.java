package metodos_estaticos;

public class Exercicio06 {
    //Teste da classe Conversao de Unidades de Tempo

    public static void main(String[] args) {
        double minuto = 35;
        double segundos = ConversaoDeUnidadesDeTempo.minutoToSegundos(minuto);
        System.out.println("Conversao de 35 minutos para segundos: " + segundos);

        double horas = 2;
        double minutos = ConversaoDeUnidadesDeTempo.horaToMinutos(horas);
        System.out.println("Conversao de 2 horas para minutos: " + minutos);

        double dias = 5;
        double horas1 = ConversaoDeUnidadesDeTempo.diaToHoras(dias);
        System.out.println("Conversao de 5 dias para horas: " + horas1);

        double semanas = 3;
        double dias1 = ConversaoDeUnidadesDeTempo.semanaToDias(semanas);
        System.out.println("Conversao de 3 semanas para dias: " + dias1);

        double meses = 2;
        double dias2 = ConversaoDeUnidadesDeTempo.mesToDias(meses);
        System.out.println("Conversao de 2 meses para dias: " + dias2);

        double anos = 4;
        double dias3 = ConversaoDeUnidadesDeTempo.anosToDias(anos);
        System.out.println("Conversao de 4 anos para dias: " + dias3);
    }
}
