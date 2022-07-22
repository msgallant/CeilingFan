/** This class is responsible for keeping track of the ceiling fan's state 
 * which includes how fast the blades are spinning if it's not off and which 
 * direction the blades are turning. It has methods to to go through all the
 *  speed states and direction states sequentially. */

public class CeilingFan {
	private SpeedSetting speedSetting = SpeedSetting.OFF;
	private ReverseSetting reverseSetting = ReverseSetting.OFF;
	
	/** Keeps track of its speed setting and reverse setting. */
	public CeilingFan() {
		
	}
	
	/** Changes to the next speed setting. */
	public void pullSpeedCord() {
		SpeedSettingController ssc = new SpeedSettingController();
		speedSetting = ssc.nextSpeedSetting(speedSetting);
	}
	
	/** Changes to the next direction the blades should spin. */
	public void pullReverseCord() {
		ReverseSettingController rsc = new ReverseSettingController();
		reverseSetting = rsc.nextReverseSetting(reverseSetting);
	}

	/** @return the current speed setting of the ceiling fan. */
	public SpeedSetting getSpeedSetting() {
		return speedSetting;
	}

	/** 
	 * @return The current reverse setting of the ceiling fan. */
	public ReverseSetting getReverseSetting() {
		return reverseSetting;
	}


	
}
