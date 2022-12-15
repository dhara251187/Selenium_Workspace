package data;

public class ReadWriteExcelFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Xls_Reader d = new Xls_Reader("C:\\QA\\Testing\\wetransfer_build-xml_2022-10-16_1427\\NikulTest.xlsx");
		
		System.out.println(d.getCellData("Data1", "Name", 3));
		System.out.println(d.getCellData("Data1", 1, 2));
		System.out.println(d.getCellData("Data1", "Browser", 2));
		System.out.println(d.getRowCount("Data1"));
		System.out.println(d.getColumnCount("Data1"));
		d.setCellData("Data1", "Name", 11, "Testing11");
		System.out.println(d.getCellData("Data1", "Name", 11));
		System.out.println(d.getRowCount("Data1"));
		d.addColumn("Data1", "Nikul");
		System.out.println(d.getColumnCount("Data1"));

	}

}
