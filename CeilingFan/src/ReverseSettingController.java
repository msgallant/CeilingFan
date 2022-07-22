/** It has the responsibility of handling the logic that determines what the next
 *  reverse setting will be. */
public class ReverseSettingController {
	
	/** It controls the direction of which the fan blades spin
	 * alternates between on and off every time this method is called.
	 * Off represents the fan blades spinning in the default direction
	 * and on represents the fan blades spinning in the opposite direction.
	 * @param reverseSetting The current reverse setting of a ceiling fan.
	 * @return The updated reverse setting for the ceiling fan. */
	public ReverseSetting nextReverseSetting(ReverseSetting reverseSetting) {
		if (reverseSetting == ReverseSetting.OFF)
		{
			reverseSetting = ReverseSetting.ON;
		}
		else if (reverseSetting == ReverseSetting.ON)
		{
			reverseSetting = ReverseSetting.OFF;
		}
		return reverseSetting;
	}

}
