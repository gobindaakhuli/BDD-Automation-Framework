package reusable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReusableClass {
	public static final String FILE_PATH=".\\src\\main\\resources\\Property.properties";
	public static Properties p = new Properties();
	public static void initProperties() throws IOException {
		FileInputStream fs = new FileInputStream(FILE_PATH);
		p.load(fs);
		System.out.println("************** Property file load successfully **************");
	}

}
