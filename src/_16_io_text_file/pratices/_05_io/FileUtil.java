package _16_io_text_file.pratices._05_io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {

    public static final String FILE_PATH = "/home/moon/C1220G2_NguyenDucHau_Module2/src/_16_io_text_file/pratices/_05_io/student.csv";

    //ghi
    public static void writeCSV(Student student){
        File file = new File(FILE_PATH);
        FileWriter fileWriter = null;
        BufferedWriter buffWrite = null;
        try {

            fileWriter = new FileWriter(file, true);

            buffWrite = new BufferedWriter(fileWriter);

            buffWrite.write(student.getId()+","+student.getName() +"\n");
            buffWrite.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(buffWrite != null){
                    buffWrite.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //doc
    public static List<Student> readCSV(){
        List<Student> studentList = new ArrayList<>();
        BufferedReader buffRead = null;
        File file = new File(FILE_PATH);
        try {
            FileReader fileReader = new FileReader(file);
            buffRead = new BufferedReader(fileReader);

            String line;
            String[] temp;
            Student student;
            while ((line = buffRead.readLine()) !=null){
                temp = line.split(",");
                student = new Student(Integer.parseInt(temp[0]), temp[1]);
                studentList.add(student);
            }

        } catch (FileNotFoundException e) {
            System.out.println("co loi ban oi.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                buffRead.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return studentList;
    }
}
