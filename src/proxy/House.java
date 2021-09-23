package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//动态代理要点,根据内存中的被代理类去动态的创建代理类好对象
//public interface House {
//    void rent();
//}


class ProxyFactory {
//    private Object object;

    public static Object getProxyInstance(Object object) {//拿到被代理类对象
//        this.object = object;
//        MyInvocationHandler handler = new MyInvocationHandler();
        //创建代理类对象
        Object obj = Proxy.newProxyInstance/*通过代理类创建代理类对象*/
                (object.getClass().getClassLoader(), object.getClass().getInterfaces()
                , new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //代理类对象对拿到的被代理类对象进行方法的执行
                        Object invoke = method.invoke(object, args);
                        return invoke;
                    }
                });
        return obj;
    }

//    @Override
//    public void rent() {
//        System.out.println("对房源进行包装");
//        house.rent();//租客租赁的方式
//        System.out.println("和租客谈成协议");
//    }
}

//class MyInvocationHandler implements InvocationHandler{
//    @Override
//    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//        return null;
//    }
//}

