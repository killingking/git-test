public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 11, 3, 6, 500, 13};
        int times = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int outSort = 1;

            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    outSort = 0;
                }
            }
            if (outSort == 1) {
                times = i + 1;
                break;
            }
        }
        System.out.println("time is " + times);
        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);
        }
    }
}
