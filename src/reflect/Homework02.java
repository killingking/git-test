package reflect;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Homework02 {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, IOException {
        Class<File> fileClass = File.class;
        Constructor<?>[] declaredConstructors = fileClass.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor.getName());
        }
        File file = fileClass.newInstance();
        Constructor<File> constructor = fileClass.getConstructor(String.class);
        File file1 = constructor.newInstance("d:\\temp\\aa.txt");
        System.out.println(file1.getName());
        System.out.println(file1.createNewFile());
    }
}
