package core;

import algorithms.BubbleSort;
import algorithms.MergeSort;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import utils.CreateExcel;

/**
 * The type Sort service.
 */
public class SortService {

  /**
   * Bubble sort string.
   *
   * @param array of strings.
   */
  public void bubbleSortString(String[] array) {
    long startTime = System.nanoTime();

    BubbleSort.sortArrayStrings(array);

    long endTime = System.nanoTime();

    long duration = (endTime - startTime) / 1000000;

    System.out.print("\n\nPerforming Bubble Sort...");
    System.out.print("\nBubble Sort duration: " + duration + "/ms");
  }

  /**
   * Merge sort strings.
   *
   * @param array of strings.
   */
  public void mergeSortStrings(String[] array) {
    long startTime = System.nanoTime();

    MergeSort.sortStrings(array);

    long endTime = System.nanoTime();

    long duration = (endTime - startTime) / 1000000;

    System.out.print("\n\nPerforming Merge Sort...");
    System.out.print("\nMerge Sort duration:: " + duration + "/ms");
  }

  /**
   * Read excel data list.
   *
   * @return the list.
   */
  public List<String> readExcelData(int total) {

    CreateExcel c = new CreateExcel();

    c.createExcel(total);

    List<String> students = new ArrayList<>();

    try (FileInputStream fis = new FileInputStream(new File("items.xlsx"));
        Workbook workbook = new XSSFWorkbook(fis)) {

      Sheet sheet = workbook.getSheetAt(0);

      for (Row row : sheet) {
        Cell cell = row.getCell(0);

        if (cell != null) {
          students.add(cell.getStringCellValue());
        }
      }
    } catch (IOException e) {
      e.getMessage();
    }

    return students;
  }
}
