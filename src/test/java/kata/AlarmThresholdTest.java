package kata;

import kata.alarm.Alarm;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AlarmThresholdTest {

	@Test
	public void testAlarmOn() {
		Alarm objAlarm = new Alarm();
		
		Assert.assertEquals(true, objAlarm.isAlarmOn());
	}

	
	
	@Test
	public void testAlarmOnThreshold() {
		Alarm objAlarm = new Alarm();
		
		Assert.assertEquals(true, objAlarm.isAlarmOn(17,21));
	}
	

	@Test
	public void testAlarmOffThreshold() {
		Alarm objAlarm = new Alarm();
		
		Assert.assertEquals(false, objAlarm.isAlarmOn(1,100));
	}

	
}
