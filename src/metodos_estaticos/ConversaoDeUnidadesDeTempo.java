package metodos_estaticos;

public class ConversaoDeUnidadesDeTempo {
    private static final double MINUTO_TO_SEGUNDOS = 60;
    private static final double HORA_TO_MINUTOS = 60;
    private static final double DIA_TO_HORAS = 24;
    private static final double SEMANA_TO_DIAS = 7;
    private static final double MES_TO_DIAS = 30;
    private static final double ANOS_TO_DIAS = 365.25;

    public static double minutoToSegundos(double minuto) {
        return minuto * MINUTO_TO_SEGUNDOS;
    }
    public static double horaToMinutos(double hora) {
        return hora * HORA_TO_MINUTOS;
    }
    public static double diaToHoras(double dia) {
        return dia * DIA_TO_HORAS;
    }
    public static double semanaToDias(double semana) {
        return semana * SEMANA_TO_DIAS;
    }
    public static double mesToDias(double mes) {
        return mes * MES_TO_DIAS;
    }
    public static double anosToDias(double anos) {
        return anos * ANOS_TO_DIAS;
    }
}
