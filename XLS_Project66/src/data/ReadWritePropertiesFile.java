package data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import javax.imageio.stream.FileImageInputStream;

public class ReadWritePropertiesFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream f = new FileInputStream("C:\\QA\\Testing\\prop.properties");
		Properties prop = new Properties();
		prop.load(f);
		
		String s = prop.getProperty("browser");
		System.out.println(s);
		System.out.println(prop.getProperty("incorrectemail"));
		System.out.println(prop.getProperty("correctEmail"));
		System.out.println(prop.getProperty("url"));
		
		prop.setProperty("testing", "Automation");
		System.out.println(prop.getProperty("testing"));
		
		prop.setProperty("tool", "selenium");
		System.out.println(prop.getProperty("tool"));
		
		FileOutputStream fo = new FileOutputStream("C:\\QA\\Testing\\prop.properties");
		prop.store(fo, "Adding to properties File");
		
		

	}

}
