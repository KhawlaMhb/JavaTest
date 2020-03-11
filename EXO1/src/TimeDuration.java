
public class TimeDuration {

	private int duration;
	
	public TimeDuration(int duration) throws BadBadValueException {
		if (duration < 0) throw new BadBadValueException();
		this.duration = duration;
	}

	@Override
	public String toString() {
		int hours =0, min=0;
		String res = "";
		
		if (duration >= 3600) {
			hours = duration/3600;
			duration = duration - hours * 3600;
			res+= hours + "h ";
		}
		if (duration >= 60 ) {
			min = duration/60;
			duration = duration - min * 60;	
			res+= min + "m ";
		}
		if (hours > 0 && min == 0) res+= "0m ";
		res+= duration+ "s";
		return res;
	}
	
	public int getDuration() {
		return duration;
	}
}
