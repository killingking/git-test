package sort.selectsort;

public class SelectSort {
    //选择排序要点
    //选择数组中的最小/大元素放置到首/尾位置,一般用首,使其部分形成有序,往后每一次都是选择剩下的元素选择一个最小的元素填充到有序元素序列的最后一个位置
    //1.进行n-1次排序,每次确定一个元素
    //2.没填放一个元素,指针位置往后移动
    //3.记录需要交换的最小元素的下标
    public static void selectSort(int[] arr) {
        //定义记录最小元素和元素所在下标的变量
        int min;
        int index;
        for (int i = 0; i < arr.length - 1; i++) { //进行n-1趟排序
            min = arr[i];
            index = i;
            for (int j = i + 1; j < arr.length; j++) {//得到最小元素的下标
                //假定当前需要确定的下标的元素是最小的
                if (min > arr[j]) {
                    index = j;
                    min = arr[j];//记录最小元素
                }
            }
            //放置元素使其数组前面元素形成有序
            arr[index] = arr[i];
            arr[i] = min;
        }
    }
}
