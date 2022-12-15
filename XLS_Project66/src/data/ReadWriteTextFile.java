package data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteTextFile {

	public static void main(String[] args) throws IOException {
		
		//create a new text file
		File f = new File("C:\\QA\\Testing\\temp.txt");
		f.createNewFile();
		
		//write into Text File
		FileWriter w = new FileWriter(f);
		BufferedWriter out = new BufferedWriter(w);
		out.write("This is 1st line");
		out.newLine();
		out.write("This is 2nd line");
		out.newLine();
		out.write("This is 3rd line");
		out.newLine();
		out.write("This is 4th line");
		out.newLine();
		out.write("This is 5th line");
		out.flush();
		
		//read text file
		FileReader r= new FileReader(f);
		BufferedReader rd = new BufferedReader(r);
	
		while(true) {
			String s = rd.readLine();
			if(s==null)
			{
				break;
			}
			System.out.println(s);

		}
		
	//	String s;
	//	int i=0;
	//	while((s=rd.readLine())!=null) {
	//		System.out.println(s);
	//		i++;
	//	}
		
	//	System.out.println("number of lines: "+i);

}
}
			
		//System.out.println("null");
		
		//System.out.println(rd.readLine());
		//System.out.println(rd.readLine());
		//System.out.println(rd.readLine());
		//System.out.println(rd.readLine());
		//System.out.println(rd.readLine());
		
		


