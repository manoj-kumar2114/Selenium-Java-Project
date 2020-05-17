import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileReader {

	public static void main(String[] args) {
		File file=new File("C:\\Users\\manoj\\Desktop\\FileReading.xlsx");
		try {
			FileInputStream fis=new FileInputStream (file);
			XSSFWorkbook workbook=new XSSFWorkbook(fis);
			String data=workbook.getSheet("login").getRow(0).getCell(1).getStringCellValue();
			String testdata=workbook.getSheet("login").getRow(1).getCell(1).getStringCellValue();
			System.out.println(data);
			System.out.println(testdata);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
