package io;

import java.io.*;

public class HomeWork02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        String str = null;
        try {
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("D:\\download\\12306Bypass\\使用须知.txt"),"GBK"));
            while((str = br.readLine())!=null){
                System.out.println(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
          br.close();
        }
    }
}
