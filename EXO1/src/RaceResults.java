
import java.util.HashMap;
import java.util.Map;

public class RaceResults {
	
	Map<String,TimeDuration> res;
	
	public RaceResults() {
		res =  new HashMap<String,TimeDuration>(); 
	}
	
	public void onNewResult(String tagNumber, TimeDuration resultTime) {
		res.put(tagNumber, resultTime);
	}
	
	public void printResults() {
		for (Map.Entry<String,TimeDuration> entry : res.entrySet())
		{ 
			System.out.print(entry.getKey()); 
			entry.getValue().toString();
		}
	}

}
