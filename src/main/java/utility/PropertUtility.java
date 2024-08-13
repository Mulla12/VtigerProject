package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertUtility {
	public String getInputData(String key) throws IOException
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\sumai\\eclipse-workspace\\com.crm.FinalMockA6\\src\\test\\resources\\properties.properties");
		Properties p = new Properties();
		p.load(fis);
		return p.getProperty(key);
	}
}



