package sort.insertsort;

public class ShellSort {

    public static void shellSort(int[] arr) {
        //n/2+1   7/2+1=4
        //分组 size/2+1
        //排序
        //arr[index]  和 arr[index+(n/2+1)]
        //第一层循环,进行分组,结束条件就是分组为0
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {//步长分组
            //第二层循环 按步长插入位置
            //如何插入
            //1.根据步长
            //
            for (int i = 0; i < arr.length; i+=gap/*记录需要修改的下标的变量*/) {
                System.out.println("这是newBranch要提交的");
            }
        }

    }
}
