package io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class HomeWork01 {
    public static void main(String[] args) throws IOException {
        String temp = "D:\\mytemp";
        File file = new File(temp);
        if(file.isDirectory()){
            System.out.println("该文件夹已存在!");
        }else {
            file.mkdirs();
        }
        File file1 = new File(file, "hello.txt");
        if(file1.exists()){
            System.out.println("该文件已存在不要创建了");
        }else {
            file1.createNewFile();
        }
        FileWriter fw = new FileWriter(file1);
        fw.write("hollo,world");
        fw.close();
    }

}
