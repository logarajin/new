package kata.alarm;


/**
 * 
 * @author 44008172
 *
 */
public class Sensor implements ISensor,ISensorThreshold {

	private final double lowThreshold = 17;
	private final double highThreshold = 21;

	// method to mimic random return value from remote service
	public double readValue() {
		return 30 * Math.random();
	}

	
	/**
	 * check
	 */
	public boolean check() {

		boolean alarmOn = false;

		double sensorValue = readValue();

		if (sensorValue < lowThreshold || highThreshold < sensorValue) {
			alarmOn = true;
		} else {
			alarmOn = false;
		}

		return alarmOn;

	}

	
	/**
	 * check alarm status 
	 */
	public boolean check(double lowThreshold, double highThreshold) {
		boolean alarmOn = false;

		double sensorValue = readValue();
		

		if (sensorValue < lowThreshold || highThreshold < sensorValue) {
			alarmOn = true;

		} else {
			alarmOn = false;
		}

		System.out.println("alarmOn -->"+alarmOn);
		return alarmOn;
	}

}
