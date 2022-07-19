
public class CeilingFan {
	private int speedSetting = 0;
	private boolean reverseSetting = false;
	
	public CeilingFan() {
		
	}
	
	public void pullSpeedCord() {
		speedSetting++;
		if (speedSetting == 4)
		{
			speedSetting = 0;
		}
	}
	
	public void pullReverseCord() {
		reverseSetting = !reverseSetting;
	}

	public int getSpeedSetting() {
		return speedSetting;
	}


	public boolean getReverseSetting() {
		return reverseSetting;
	}

	public String getStatus() {
		String status = "Speed setting: " + String.valueOf(speedSetting) +
				". Reversed: " + String.valueOf(reverseSetting) + ".";
		return status;
	}

	
}
