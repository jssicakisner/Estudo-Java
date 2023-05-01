package loops;

import java.util.List;
import java.util.Map;

public interface Exercicio {
    public String getStatement();
	
	public List<String> getInputNames();
	
	public void setInputMap(Map<String, String> input);
	
	public String getResultDescription();
	
	public void solve();
}
