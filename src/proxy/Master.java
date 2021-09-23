package proxy;

@FunctionalInterface
public interface Master {
//    void rent(){
//        System.out.println("出租房屋");
//    }
//    不需要方法体
    void rent();
}

class ProxyMan implements Master{


    private Master master;
    ProxyMan(Master master){
        this.master = master;
    }

    @Override
    public void rent() {
        modified();
        //要点
        master.rent();
        rentPact();
    }

    private void modified(){
        System.out.println("对房子进行装修");
    }

    private void rentPact(){
        System.out.println("完成协议签署");
    }
}

class RentMan implements Master{
    @Override
    public void rent() {
        System.out.println("对房子进行租赁");
    }
}