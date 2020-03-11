
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class RaceResults {
	
	Map<String,Integer> res;
	
	public RaceResults() {
		res =  new HashMap<String,Integer>(); 
	}
	
	public void onNewResult(String tagNumber, TimeDuration resultTime) {
		res.put(tagNumber, resultTime.getDuration());
	}
	
	public void printResults() throws BadBadValueException {
		final Map<String, Integer> sortedByCount = res.entrySet()
                .stream()
                .sorted((Map.Entry.<String, Integer>comparingByValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		for (Map.Entry<String,Integer> entry : sortedByCount.entrySet())
			System.out.println(entry.getKey()  +" : " + new TimeDuration(entry.getValue()));
		
	}

}

