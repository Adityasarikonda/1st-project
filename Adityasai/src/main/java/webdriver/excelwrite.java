package webdriver;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class excelwrite {
    public static void main(String[] args) throws IOException {

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("sample books 1");

        Object [][] bookdata = {{"seleinium","pil",356},{"java","veere",877},{"test","adi",987}};

        int rowcount = 0;

        for (Object[]abook:bookdata) {
            Row row = sheet.createRow(rowcount++);

            int columncount = 0;
            for (Object feild:abook) {
                Cell cell = row.createCell(columncount++);

                if (feild instanceof String) {
                    cell.setCellValue((String) feild);
                }
                else if (feild instanceof Integer){
                    cell.setCellValue((Integer)feild);
                }
            }

            FileOutputStream outputStream = new FileOutputStream("C:\\Users\\aditya\\OneDrive\\Desktop\\Documents\\test2.xlsx");
            workbook.write(outputStream);

        }


    }
}
