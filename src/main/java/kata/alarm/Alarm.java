package kata.alarm;

public class Alarm implements IAlarm,IAlarmThreshold
{

    private ISensor sensor = new Sensor();
    

    private ISensorThreshold sensorThreshold = new Sensor();

    public boolean isAlarmOn()
    {
        return sensor.check();
    }
    
    
    
    public boolean isAlarmOn(double lowThreshold,double highThreshold)
    {
        return sensorThreshold.check(lowThreshold,highThreshold);
    }
}
