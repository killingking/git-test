package sort.exchangesort;

public class BubbleSort {


    public static void bubbleSort(int[] arr) {
        //冒泡排序要素
        //1.采用数据交换
        //2.进行arr.length-1趟排序,最后一个元素就是确定了的
        //3.冒泡:数据大/小的元素放置到后面

        int temp;
        //进行优化,如果有序则跳过
        boolean flag = false;
        for (int i = 0; i < arr.length - 1; i++) {//进行n-1趟排序
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) { //从小到大排
                    //如果任意一轮排序进行了交换,则为true
                    flag = true;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if (flag){
                flag = false;//如果进行了交换,重标志
            }else {
               return;//如果没有交换则数组本就是有序的
            }
        }
    }
}
