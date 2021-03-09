package _16_io_text_file.exrcises;

import java.io.*;
import java.util.Scanner;

public class CopiedFile {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap duong dan file goc : ");
        String source = sc.nextLine();
        System.out.println("Nhap duong dan file dich : ");
        String target = sc.nextLine();

        File file = new File(source);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        File targetFile = new File(target);
        FileWriter fileWriter = new FileWriter(targetFile);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            bufferedWriter.write(line + "\n");
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}
