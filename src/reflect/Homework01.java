package reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Homework01 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class cls = Class.forName("reflect.PrivateTest");
        System.out.println(cls);
        PrivateTest instance = (PrivateTest)cls.newInstance();
        Field field = cls.getDeclaredField("name");
        //can not access a member
        //开启访问私有属性
        field.setAccessible(true);
        System.out.println(field.getName());
        //set(对象,"修改的值")
        field.set(instance,"tom");
        System.out.println(field.get(instance));
        Method getName = cls.getMethod("getName");
        System.out.println(getName.invoke(instance));
    }
}

