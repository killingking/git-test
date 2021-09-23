package io;


import java.io.*;
import java.util.Properties;


public class Homework03 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream("dog.properties");
        //System.out.println(fileInputStream.read());
        properties.load(fileInputStream);
        String name = properties.getProperty("name");
        String color = properties.getProperty("color");
        int age = Integer.parseInt(properties.getProperty("age"));
        Dog dog = new Dog(name, age, color);
        System.out.println(dog);
        seriaDog(dog);
    }

    public static void seriaDog(Dog dog) throws IOException {
        ObjectOutputStream oos = null;
        oos = new ObjectOutputStream(
                new FileOutputStream("dog.dat"));
        oos.writeObject(dog);
        oos.close();
    }
}

class Dog implements Serializable {
    private String name;
    private int age;
    private String color;

    public Dog() {
    }

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}