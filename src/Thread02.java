import static java.lang.Thread.sleep;

public class Thread02 implements Runnable {
    private static int count;

    @Override
    public void run() {
        while (true) {
            System.out.println("喵喵,我是小猫咪" + Thread.currentThread().getName());
            try {
                count++;
                if (count > 30) {
                    break;
                }
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
