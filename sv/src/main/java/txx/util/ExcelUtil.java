package txx.util;

import com.txx.entity.pojo.Exam;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Date;

/**
 * 帅气的创建
 * <p>
 * <p>
 * feature;
 */
public class ExcelUtil {

    public static void readExcel(String path) throws Exception{
        File file = new File(path);
        if (!file.exists()){
            throw new Exception("文件不存在！");
        }
        if (!file.isFile()){
            throw new Exception("路径下不是文件！");
        }
        Workbook workbook = Workbook.getWorkbook(file);
       Sheet sheet = workbook.getSheet(0);
        for (int row=0;row<5;row++){
            for (int col=0;col<5;col++){
                Cell cell = sheet.getCell(col,row);
                System.out.println(cell.getContents());
            }
        }
        workbook.close();
    }

    public static void main(String[] args) {
        try {
            ExcelUtil.readExcel("d:/test.xls");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
