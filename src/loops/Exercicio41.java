package loops;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Exercicio41 extends AbstractExercicio {
    
    private Map<String, String> input;
    private String result;
    private static final Map<Integer, Double> tabelaJuros;
    static {
        tabelaJuros = new HashMap<>();
        tabelaJuros.put(1, 0.0);
        tabelaJuros.put(3, 0.10);
        tabelaJuros.put(6, 0.15);
        tabelaJuros.put(9, 0.20);
        tabelaJuros.put(12, 0.25);
    }
    public List<String> getInputNames() {
        return Arrays.asList("Valor da Dívida");
    }
    public void setInputMap(Map<String, String> input) {
        this.input = input;
    }
    public String getResultDescription() {
        return this.result;
    }
    public void solve() {
        double valor = Double.valueOf(input.values().stream().findFirst().get());
        Set<Integer> keys = tabelaJuros.keySet();
        StringBuffer buff = new StringBuffer();
        for(Integer key: keys) {
            buff.append(String.format("{\"VALOR DA DIVIDA\": %2f;\"VALOR DOS JUROS\": %.2f,\"QUANTIDADE DE PARCELAS\": %d, \"VALOR DA PARCELA\": %.2f}\n",
            valor + (valor*tabelaJuros.get(key)), valor*tabelaJuros.get(key), key, (valor + (valor*tabelaJuros.get(key)))/(key*1f)));
        }
        this.result = buff.toString();
    }
    @SuppressWarnings("serial") public static void main(String[] args) {
        Exercicio exercicio = new Exercicio41();
        exercicio.setInputMap(new HashMap<String, String>() {{
            put("XX", "1000");
        }
    });
    exercicio.solve();
    System.out.println(exercicio.getResultDescription());
    }
    @Override
    public String getStatement() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getStatement'");
    }

}
