

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
/** Tests the ceiling fan class.*/
class CeilingFanTest {

	/** test to make sure speed setting and reverse setting is set to off 
	 * when a CeilingFan is initialized */
	@Test
void ceilingFanInitializationTest() {
		
		CeilingFan ceilingFan = new CeilingFan();
		assertEquals(ceilingFan.getSpeedSetting(), SpeedSetting.OFF);
		assertEquals(ceilingFan.getReverseSetting(), ReverseSetting.OFF);
	}
	
	/** test to make sure when you pull the speed cord the correct speed settings are 
	 * set. When initialized it starts at off and when pulled it alternates as follows:
	 *  SPEED_1, SPEED_2, SPEED_3, OFF */
	@Test
	void ceilingFanPullSpeedCordTest() {
		
		CeilingFan ceilingFan = new CeilingFan();
		ceilingFan.pullSpeedCord();
		assertEquals(ceilingFan.getSpeedSetting(), SpeedSetting.SPEED_1);
		ceilingFan.pullSpeedCord();
		assertEquals(ceilingFan.getSpeedSetting(), SpeedSetting.SPEED_2);
		ceilingFan.pullSpeedCord();
		assertEquals(ceilingFan.getSpeedSetting(), SpeedSetting.SPEED_3);
		ceilingFan.pullSpeedCord();
		assertEquals(ceilingFan.getSpeedSetting(), SpeedSetting.OFF);
	}
	
	/** test to make sure when you pull the reverse cord the the correct reverse setting 
	 * is set. When initialized it starts at off and when pulled it alternates between 
	 * on and off. */
	@Test
	void ceilingFanPullReverseCordTest() {
		CeilingFan ceilingFan = new CeilingFan();
		ceilingFan.pullReverseCord();
		assertEquals(ceilingFan.getReverseSetting(), ReverseSetting.ON);
		ceilingFan.pullReverseCord();
		assertEquals(ceilingFan.getReverseSetting(), ReverseSetting.OFF);
	}
	
	

}
