/** It has the responsibility of handling the logic that determines what the next 
 * speed setting will be. */
public class SpeedSettingController {

	/** It controls the speed of the ceiling fan increases the speed every time this method 
	 * is called unless it is on max speed setting number 3, then it turns off next 
	 * time it's called. 
	 * @param speedSetting The current speed setting of a ceiling fan.
	 * @return The updated speed setting for the ceiling fan.*/
	public SpeedSetting nextSpeedSetting(SpeedSetting speedSetting) {
		if (speedSetting == SpeedSetting.OFF)
		{
			speedSetting = SpeedSetting.SPEED_1;
		}
		else if (speedSetting == SpeedSetting.SPEED_1)
		{
			speedSetting = SpeedSetting.SPEED_2;
		}
		else if (speedSetting == SpeedSetting.SPEED_2)
		{
			speedSetting = SpeedSetting.SPEED_3;
		}
		else if (speedSetting == SpeedSetting.SPEED_3)
		{
			speedSetting = SpeedSetting.OFF;
		}
		
		return speedSetting;
	}
}
