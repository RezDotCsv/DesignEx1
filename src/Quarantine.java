import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Quarantine {

	public Map isolation = new HashMap();
	
	public void isolate(Person p) {
		isolation.put(p.getId(), p);
	}
	public int peopleIsolated() {
		return isolation.size();
	}
	/*
	 * public List<Person> people(){
	 * 
	 * 
	 * }
	 */
	
	
}
