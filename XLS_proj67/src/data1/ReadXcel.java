package data1;

public class ReadXcel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Xls_Reader rd=new Xls_Reader("C:\\QA\\Testing\\wetransfer_build-xml_2022-10-16_1427\\NikulTest.xlsx");
		System.out.println(rd.getCellData("Data1", "Email Error", 2));
		System.out.println(rd.getCellRowNum("Data1", "Name", "Nikul"));
		System.out.println(rd.getCellData("Data1", 4, 3));
	}

}
