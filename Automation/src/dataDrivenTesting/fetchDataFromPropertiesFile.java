package dataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class fetchDataFromPropertiesFile {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\Dell\\eclipse-workspace\\Automation\\test-data\\datafile.properties");
		FileInputStream fis = new FileInputStream(f);
		Properties prop = new Properties();
		prop.load(fis);
		String url = prop.getProperty("url");
		System.out.println(url);
		
		System.out.println(prop.getProperty("email"));
		System.out.println(prop.getProperty("password"));
	}
}
