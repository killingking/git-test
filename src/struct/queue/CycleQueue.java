package struct.queue;

public class CycleQueue {
    private int rear;
    private int front;
    private int maxSize;
    private int arr[];

    //重新整理一下思路,首先定义策略:
    //1.队满策略(front+1)%max==rear 很好理解
    //2.队空策略这个就难些,这里设计是根据出队的时候做了判断,如果rear和front都指向同一个元素,那么出完队就是空队列了,此时重置rear和front的指针
    //重置的指针和初始化一样即可,初始化队列就是空的,那么判断的策略就很简单了,它们都指向-1
    //数组循环队列理解了以上的两个要点,实现起来就非常简单了
    //另外:根据下标元素用取模的方式解决
    public CycleQueue(int size) {
        arr = new int[size];
        maxSize = size;
        rear = -1;
        front = -1;
    }


    public boolean addQueue(int n) {
        if (isFull()) {
            System.out.println("队列已满");
            return false;
        }
        if (isEmpty()) {
            rear = 0;
        }
        front = (front + 1) % maxSize;

//        if (front == maxSize - 1) {
//            front = 0;
//        } else if (front == -1) {
//            rear++;
//            front++;
//        } else {
//            front++;
//        }
        arr[front] = n;
        return true;
    }

    public int getQueue() {
        if (isEmpty()) {
            System.out.println("队列为空");
            return -1;
        }
        int elm = arr[rear];
        if (rear == front) {
            front = -1;
            rear = -1;
        } else {
            rear = (rear + 1) % maxSize;
        }
//        int elm;
//        if (rear == front) {
//            elm = arr[rear];
//            rear = -1;
//            front = -1;
//        } else if (rear < maxSize - 1) {
//            elm = arr[rear++];
//        } else {
//            rear = 0;
//            elm = arr[rear];
//        }
        return elm;
    }

    public int getSize() {
        //r->2 f->3 = f-r + 1 = 2
        //r->2 f->0  (f+1)%max +r = -1 0123 =3
        if (isEmpty()) {
            return 0;
        }
        if (rear > front) {
            return maxSize - rear + front + 1;
        } else {
            return front - rear + 1;
        }
    }

    public int headQueue() {
        if (isEmpty()) {
            System.out.println("队列为空");
            return -1;
        }
        return arr[front];
    }

    public boolean isFull() {
        //满的条件是个数达到最大,由于是环状的队列,所有判断是否为满需要设计(假设max = 4)
        //1.front的值是移动的,rear的值也是移动的,而且它们的下标不是增长型的,比如数组最大为4,front的下标为0,rear的下标为1,这样是被允许的
        //正常想到的队满情况是 rear->0,front->max-1 ,另外 如果 front ->2 ?  那rear要指向->3才是满的情况
        //1.r->0 f->3 2.r->1 f->0 3.r->2 f->1 4.r->3 f->2
        //综述推出规律,1.判断是否满应该和max相关,(front+1)%max==rear,主要的难点是在r->0情况该怎么判断
        return (front + 1) % maxSize == rear;
    }

    public boolean isEmpty() {
        return front == -1;
    }
}

