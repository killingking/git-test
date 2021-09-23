package sort.insertsort;

public class InsertSort {
    //插入排序要点:
    //将数组看成两个序列,前面的序列是有序的,后面的序列是无序的,将无序序列的第一个元素放置到有序序列里面,使其继续形成有序序列
    //1.只有一个的情况下是有序的,排除第一个,要进行n-1次确定序列是有序的
    //2.没添加一个元素到有序序列,有序序列需要扩展一个空间,数组元素要往后移动一个位置,取代无序序列的第一个元素位置
    public static void insertSort(int[] arr) {
        int insertIndex;
        int j;
        int insertElem;//记录要前置插入的元素值
        for (int i = 1; i < arr.length; i++) {//第一个不需要安排
            insertElem = arr[i];
            insertIndex = i - 1;
            while (insertIndex >= 0 && insertElem < arr[insertIndex]) {
                arr[insertIndex + 1] = arr[insertIndex];
                insertIndex--;
            }
            if (insertIndex + 1 != i) {
                arr[insertIndex + 1] = insertElem;
            }
//            for (j = i; j > 0; j--) {
//                if (temp >= arr[j - 1]) {
//                    arr[j] = temp;
//                    break;
//                } else {
//                    arr[j] = arr[j - 1];
//                }
//            }
//            if (j==0){
//                arr[j] = temp;
//            }
        }
    }
}
