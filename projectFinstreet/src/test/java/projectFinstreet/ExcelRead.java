package projectFinstreet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

		// TODO Auto-generated method stub
		
			XSSFSheet sh;
			public static int row;
			public static int column;

			public ExcelRead(String sheet) throws IOException {

				String path1 = System.getProperty("user.dir");
				FileInputStream inputstream = new FileInputStream(path1 + "\\src\\main\\resources\\loginData.xlsx");

				XSSFWorkbook workbook = new XSSFWorkbook(inputstream);
				sh = workbook.getSheet(sheet);
				row = sh.getLastRowNum();
				column = sh.getRow(1).getLastCellNum();
				System.out.println(sh);
				System.out.println(row);
				System.out.println(column);
			}

			public String ReadData(int row, int column) {
				XSSFRow r = sh.getRow(row);
				
				XSSFCell cell = r.getCell(column);
				int cellType = cell.getCellType();

				switch (cellType) {
				case 1: {
					
					return cell.getStringCellValue();
				}
				case 0: {
					int val = (int) cell.getNumericCellValue();
					System.out.println(val);
					return String.valueOf(val);
				}

				default:
					return " ";
				}
			}


			public static void main(String[] args) throws IOException
			{
			ExcelRead obj=new ExcelRead("sheet1");
			obj.ReadData(row, column);
			
			
			
		}


	}

