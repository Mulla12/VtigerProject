package utility;

import java.util.Random;

public class JavaUtility {
	public static int generateRandomNumber(int limit)
	{
		Random r = new Random();
		return r.nextInt(limit);
	}
}

	



