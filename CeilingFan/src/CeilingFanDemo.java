
public class CeilingFanDemo {
	public static void main(String[] args)
	{
		//ceiling fan initialized
		CeilingFan ceilingFan = new CeilingFan();
		System.out.println("Ceiling fan initialized.");
		System.out.println(ceilingFan.getStatus());
		
		//ceiling fan reversed
		ceilingFan.pullReverseCord();
		System.out.println();
		System.out.println("Ceiling fan reversed.");
		System.out.println(ceilingFan.getStatus());
		
		//ceiling fan reversed and speed setting increased by one
		ceilingFan.pullSpeedCord();
		System.out.println();
		System.out.println("Ceiling fan reversed and speed setting increased by one.");
		System.out.println(ceilingFan.getStatus());
		
		//ceiling fan not reversed and speed setting increased by one
		ceilingFan.pullReverseCord();
		ceilingFan.pullSpeedCord();
		System.out.println();
		System.out.println("Ceiling fan not reversed and speed setting increased by one.");
		System.out.println(ceilingFan.getStatus());
		
		//ceiling fan not reversed and speed setting increased by one
		ceilingFan.pullSpeedCord();
		System.out.println();
		System.out.println("Ceiling fan not reversed and speed setting increased by one.");
		System.out.println(ceilingFan.getStatus());
		
		//ceiling fan not reversed and speed setting increased by one
		ceilingFan.pullSpeedCord();
		System.out.println();
		System.out.println("Ceiling fan not reversed and speed setting increased by one.");
		System.out.println(ceilingFan.getStatus());
		
	}
}
