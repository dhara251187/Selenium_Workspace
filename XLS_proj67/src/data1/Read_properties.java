package data1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Read_properties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream f= new FileInputStream("C:\\QA\\Testing\\prop2.properties");
		Properties prop=new Properties();
		prop.load(f);
		prop.getProperty("browser");
		
		}

}
