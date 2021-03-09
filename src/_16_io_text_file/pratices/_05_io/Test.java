package _16_io_text_file.pratices._05_io;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Student> studentList = FileUtil.readCSV();
        System.out.println(studentList);
    }
}
