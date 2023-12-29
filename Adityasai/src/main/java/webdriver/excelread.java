package webdriver;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class excelread {

    public static void main(String[] args) throws IOException {

        File src = new File("C:\\Users\\aditya\\Downloads\\Aditya sarikonda Nov Time Sheet (1).xlsx");
        FileInputStream fis = new FileInputStream(src);

        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sh = wb.getSheet("aditya1");
        System.out.println(sh.getRow(1).getCell(1).getStringCellValue());
        System.out.println(sh.getRow(1).getCell(2).getStringCellValue());
        System.out.println(sh.getRow(1).getCell(3).getStringCellValue());
        System.out.println(sh.getRow(1).getCell(4).getStringCellValue());
        System.out.println(sh.getRow(26).getCell(1).getStringCellValue());

    }
}
