
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RaceResults {
	
	Map<String,TimeDuration> res;
	
	public RaceResults() {
		res =  new HashMap<String,TimeDuration>(); 
	}
	
	public void onNewResult(String tagNumber, TimeDuration resultTime) {
		res.put(tagNumber, resultTime);
	}
	
	public void printResults() throws BadBadValueException {
		List<Integer> sorted = new ArrayList<Integer>();
		
		for (Map.Entry<String,TimeDuration> entry : res.entrySet())
		{ 
			sorted.add(entry.getValue().getDuration());
		}
		Collections.sort(sorted);
		for(Integer i: sorted) {
			System.out.println(new TimeDuration(i).toString());
		}
	}

}
