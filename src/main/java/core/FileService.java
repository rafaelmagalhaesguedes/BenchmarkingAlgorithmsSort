package core;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * The FileService class provides methods for reading data from and writing data to an Excel file.
 */
public class FileService {

  /**
   * Reads data from an Excel file and returns a list of strings.
   *
   * @param total the total number of items to read
   * @return the list of strings read from the Excel file
   */
  public List<String> readExcelData(int total) {

    createExcel(total);

    List<String> items = new ArrayList<>();

    try (FileInputStream fis = new FileInputStream(new File("items.xlsx"));
        Workbook workbook = new XSSFWorkbook(fis)) {

      Sheet sheet = workbook.getSheetAt(0);

      for (Row row : sheet) {
        Cell cell = row.getCell(0);

        if (cell != null) {
          items.add(cell.getStringCellValue());
        }
      }
    } catch (IOException e) {
      e.getMessage();
    }

    return items;
  }

  /**
   * Creates an Excel file with randomly generated items.
   *
   * @param total the total number of items to generate and write to the Excel file
   */
  private void createExcel(int total) {
    List<String> items = generateItems(total);

    Workbook workbook = new XSSFWorkbook();

    Sheet sheet = workbook.createSheet("Items");

    for (int i = 0; i < items.size(); i++) {
      Row row = sheet.createRow(i);
      Cell cell = row.createCell(0);
      cell.setCellValue(items.get(i));
    }

    try (FileOutputStream fos = new FileOutputStream("items.xlsx")) {
      workbook.write(fos);
      workbook.close();
    } catch (IOException e) {
      e.getMessage();
    }
  }

  /**
   * Generates a list of randomly generated items.
   *
   * @param count the number of items to generate
   * @return the list of randomly generated items
   */
  private static List<String> generateItems(int count) {
    List<String> items = new ArrayList<>();
    Random rand = new Random();

    String[] prefix = {"Tech", "Eco", "Bio", "Power", "Glo", "Fresh", "Smart", "Pro", "Ultra", "Super"};
    String[] sufix = {"Tech", "Zone", "Max", "Lite", "Plus", "Boost", "Guard", "Xtreme", "Master", "Elite"};

    for (int i = 0; i < count; i++) {
      String item = prefix[rand.nextInt(prefix.length)] + sufix[rand.nextInt(sufix.length)];
      items.add(item);
    }

    return items;
  }
}
