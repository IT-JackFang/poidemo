package com.fxz.poi;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * 描述：
 *
 * @author Fang
 * @date 2021-02-07 17:43:03
 */
public class CreateWorkBook {

    public static void main(String[] args) throws Exception {
        /*XSSFWorkbook workbook = new XSSFWorkbook();
        FileOutputStream out = new FileOutputStream(
                new File("createworkbook.xlsx"));
        workbook.write(out);
        out.close();
        System.out.println("write successfully!");*/

        Student s1 = new Student();
        s1.setName("小红");
        s1.setMale(false);
        s1.setHeight(160);

        Student s2 = new Student();
        s2.setName("小明");
        s2.setMale(true);
        s2.setHeight(180);

        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);

        File file = new File("C:\\Users\\Fang\\Desktop\\test.xlsx");
        ExcelUtil.createExcel(students, file);
    }

}
