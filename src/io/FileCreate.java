package io;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class FileCreate {

    @Test
    public void newFile() throws IOException {
        File file = new File("D:\\ReWay\\news1.txt");
        file.createNewFile();
        //方式2

    }
    @Test
    public void newFile2() throws IOException {
        File parentFile = new File("D:\\ReWay");
        String name = "news2.txt";
        File file = new File(parentFile,name);
        file.createNewFile();
    }

}
