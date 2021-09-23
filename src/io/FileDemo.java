package io;

import org.junit.jupiter.api.Test;

import java.io.File;

public class FileDemo {
    @Test
    public void FileDelete(){
        String fileName = "D:\\ReWay\\news1.txt";
        byte[] bytes = fileName.getBytes();//将字符串转字节数组
        File file = new File(fileName);
        if(file.exists()){
            file.delete();
        }
    }
    @Test
    public void directryDelete(){
        File file = new File("D:\\temp\\demo02");
        if(file.exists()){
            System.out.println("文件(夹存在");
        }else {
            System.out.println("文件(夹)不存在");
        }
    }
}
