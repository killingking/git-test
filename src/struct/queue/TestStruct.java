package struct.queue;

import java.util.Scanner;

public class TestStruct {
    public static void main(String[] args) {
        CycleQueue cycleQueue = new CycleQueue(4);
        Scanner scanner = new Scanner(System.in);
        String str;
        while (scanner.hasNext()){
            str = scanner.next();
            switch (str){
                case "a":{
                    System.out.println("进队:"+cycleQueue.addQueue(scanner.nextInt()));
                    break;
                }
                case "g":{
                    System.out.println("出队:"+cycleQueue.getQueue());
                    break;
                }
                case "s":{
                    System.out.println("队列大小:"+cycleQueue.getSize());
                }
                case "h":{
                    System.out.println("队列头元素:"+cycleQueue.headQueue());
                }
                case "f":{
                    System.out.println("队列是否满:"+cycleQueue.isFull());
                }
                case "e":{
                    System.out.println("队列是否空:"+cycleQueue.isEmpty());
                    break;
                }
            }
        }

    }
}
