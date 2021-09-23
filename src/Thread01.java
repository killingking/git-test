public class Thread01 extends Thread {
    private static int count;
    @Override
    public void run() {
        while (true) {
            System.out.println("喵喵,我是小猫咪" + Thread.currentThread().getName());
            try {
                count++;
                if(count>30){
                    break;
                }
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class SubThread0 extends Thread0{
    @Override
    public void run() {
        System.out.println("线程实际开始运行时调用的方法");
    }
}