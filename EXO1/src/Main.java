
public class Main {

	public static void main(String[] args) throws BadBadValueException {
		RaceResults raceResults = new RaceResults();
		raceResults.onNewResult("34", new TimeDuration(345));
		raceResults.onNewResult("3342", new TimeDuration(222));
		raceResults.onNewResult("3452", new TimeDuration(6789));
		raceResults.onNewResult("234", new TimeDuration(3555));
		raceResults.printResults();

	}

}
