
//单例设计模式设计要点
//1.构造器私有化(防止外部使用构造器创建对象)
//2.对外提供创建对象的公共方法
//3.在公共方法里面完成对象的创建
public class Singleton {
    //3.完成对象的创建
    private static final Singleton singleton = new Singleton();

    //单例设计模式之饿汉式(没有线程安全问题,但是消耗资源)
    //1.私有化
    private Singleton() {
    }

    //2公共方法(静态)
    public static Singleton getInstance() {
        return singleton;
    }
}

//懒汉式--调用是创建对象
class Singleton1 {
    //使用静态变量记录保存创建的实例
    private static Singleton1 singleton1;
    //私有化
    private Singleton1() {
    }

    //公共方法
    public static Singleton1 getInstance(){
        if(singleton1 != null){
            singleton1 = new Singleton1();
        }
        return singleton1;
    }
}