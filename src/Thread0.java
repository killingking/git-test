//静态代理模拟实现Thread
//第一次写的有问题
//new Thread0(实现Runnable接口的子类对象).start()
public class Thread0 implements Runnable {
    private Runnable target = null;

    public Thread0() {
    }

    public Thread0(Runnable target){
        this.target = target;
    }

    //被调用的方法start()
    public void start() {
        start0();
    }

    //实际被调度的线程方法是start0()/是底层实现
    public void start0() {
        //线程要执行的run方法
        target.run();//子类通过重写run方法,根据多态的特性,运行时就是子类的run方法
    }

    public void run() {
    }
}