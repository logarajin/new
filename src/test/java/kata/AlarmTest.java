package kata;

import kata.alarm.Alarm;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AlarmTest {

	@Test
	public void testAlarmOn() {
		Alarm objAlarm = new Alarm();
		
		Assert.assertEquals(true, objAlarm.isAlarmOn());
	}

}
