package proxy;

public class TestMain {
    public static void main(String[] args) {
        Master master = new ProxyMan(()-> System.out.println("租房"));
        master.rent();

        //测试动态代理
        //创建被代理类对象
        RentMan rentMan = new RentMan();
        Master proxyInstance = (Master)ProxyFactory.getProxyInstance(rentMan);
        proxyInstance.rent();

//        House house = new ProxyHouse(new House() {
//            @Override
//            public void rent() {
//                System.out.println("租上三个月");
//            }
//        });
    }
}
