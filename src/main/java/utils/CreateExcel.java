package utils;

import java.util.ArrayList;
import java.util.Random;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

/**
 * The type Create excel.
 */
public class CreateExcel {

  /**
   * Create excel.
   */
  public void createExcel(int total) {
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
   * Generate names list.
   *
   * @param count the count
   * @return the list
   */
  public static List<String> generateItems(int count) {
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

