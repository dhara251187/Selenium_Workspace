package data;

import utilities.Xls_Reader;

public class DataFile {
	
	//Login Test
	Xls_Reader rd=new Xls_Reader("C:\\QA\\Testing\\login.xlsx");
	
	public String emailWithSpecChar = rd.getCellData("Sheet1", "User name", 2);
	public String wrongEmail = rd.getCellData("Sheet1", "User name", 4);
	public String wrongPassword = rd.getCellData("Sheet1", "Password", 3);
	public String specialCharerr = rd.getCellData("Sheet1", "Err", 2);
	public String emptyEmailErr = rd.getCellData("Sheet1", "Err", 3);
	public String emtyPassErr = rd.getCellData("Sheet1", "Err", 4);
	public String globalErr = rd.getCellData("Sheet1", "Err", 5);

}
