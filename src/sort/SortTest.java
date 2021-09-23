package sort;

import org.junit.jupiter.api.Test;
import sort.exchangesort.BubbleSort;
import sort.insertsort.InsertSort;
import sort.selectsort.SelectSort;

import java.util.Arrays;
import java.util.Random;

public class SortTest {

    public static void main(String[] args) {
        int arr[] = {101,45,-6,58,455,600,3};
        System.out.println("----------冒泡排序------------");
        System.out.println(Arrays.toString(arr));
        BubbleSort.bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("----------------------");
    }

    @Test
    public void bubbleSortTest(){
//        int arr[] = {101,45,-6,58,455,600,3};
//        System.out.println("----------冒泡排序------------");
//        System.out.println(Arrays.toString(arr));
//        BubbleSort.bubbleSort(arr);
//        System.out.println(Arrays.toString(arr));
//        System.out.println("----------------------");
        int size = 100000;
        Random random = new Random();
        int[] testArr = new int[size];
        for (int i = 0; i < size; i++) {
            testArr[i] = random.nextInt(size);
        }
//        System.out.println(Arrays.toString(testArr));
        long start = System.currentTimeMillis();
        BubbleSort.bubbleSort(testArr);
//        System.out.println(Arrays.toString(testArr));
        long end = System.currentTimeMillis();
        System.out.println("冒泡排序耗时:"+(end-start));//14755 //14514 //14475
    }

    @Test
    public void selectSortTest(){
        int size = 100000;
//        int size = 10;
        Random random = new Random();
        int[] testArr = new int[size];
        for (int i = 0; i < size; i++) {
            testArr[i] = random.nextInt(size);
        }
//        System.out.println(Arrays.toString(testArr));
        long start = System.currentTimeMillis();
        SelectSort.selectSort(testArr);
//        System.out.println(Arrays.toString(testArr));
        long end = System.currentTimeMillis();
        System.out.println("选择排序耗时:"+(end-start));//3994 //3924 //4001
    }

    @Test
    public void insertSortTest(){
        int size = 100000;
//        int size = 10;
        Random random = new Random();
        int[] testArr = new int[size];
        for (int i = 0; i < size; i++) {
            testArr[i] = random.nextInt(size);
        }
//        System.out.println(Arrays.toString(testArr));
        long start = System.currentTimeMillis();
        InsertSort.insertSort(testArr);
//        System.out.println(Arrays.toString(testArr));
        long end = System.currentTimeMillis();
        System.out.println("插入排序耗时:"+(end-start));//696 //722 //867
    }

    @Test
    public void insertSortTestt(){
//        int size = 100000;
        int size = 10;
        Random random = new Random();
        int[] testArr = new int[size];
        for (int i = 0; i < size; i++) {
            testArr[i] = random.nextInt(size);
        }
        System.out.println(Arrays.toString(testArr));
        long start = System.currentTimeMillis();
        InsertSort.insertSort(testArr);
        System.out.println(Arrays.toString(testArr));
        long end = System.currentTimeMillis();
        System.out.println("插入排序耗时:"+(end-start));//696 //722 //867
    }
}
