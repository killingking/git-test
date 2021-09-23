public class MiGong {
    public static void main(String[] args) {
        int[][] arr = new int[10][10];
        for (int i = 0; i < arr.length; i++) {
            arr[0][i] = 1;
            arr[arr.length - 1][i] = 1;
            arr[i][0] = 1;
            arr[i][arr.length - 1] = 1;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------");
        arr[4][1] = 1;
        arr[4][2] = 1;
        arr[4][3] = 1;
        arr[3][3] = 1;
        arr[2][2] = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------");
        MiGong mg = new MiGong();
        mg.getWay(arr, 1, 1);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    //按照老师的分析写代码(用递归
    //1方法的创建
    //1.1要点1 目标当前所在迷宫中的位置的记录 入参i j
    //1.2 因为使用的是递归的方法所有返回值的值是有没有找到终点,假定找到则为true
    //1.3 以数组传入参数中,函数调用会修改数组的值 ,递归中做了修改,才能正常递归路径
    //2迷宫的设定
    //2.1迷宫的开始位置设定为[1][1] 结束位置设定为[9][9]
    //2.2障碍物标记是1
    //2.3    重点:: 0表示可用走的路,1障碍物不可以走,2走过的路,3死路
    //3寻路的方式设定
    //3.1 先后顺序为下右上左的走法
    public boolean getWay(int[][] arr, int i, int j) {
        //什么时候结束?  找到目标后结束 即 arr[9][9] == 2 的时候
        if (arr[8][8] == 2) {
            return true;
        } else {
            //什么情况下是可以走的? 目标所在位置是0的时候是可以走的
            if (arr[i][j] == 0) {//ij表示当前所在位置
                //如果当前所在位置为0,那么我假设它往下走下去是一条可以通行的路径,那么我就先假定为2
                arr[i][j] = 2;
                //之后我开始使用寻路的设定算法开始寻找下一个目标是否是通的
                if (getWay(arr, i + 1, j)) {//下
                    //找到下一个路径是2 然后说明路通了,把自身设置为2,并且放回true告知上一阶的寻路对象
                    return true;
                } else if (getWay(arr, i, j + 1)) {
                    //找到下一个路径是2 然后说明路通了,把自身设置为2,并且放回true告知上一阶的寻路对象
                    return true;
                } else if (getWay(arr, i - 1, j)) {
                    //找到下一个路径是2 然后说明路通了,把自身设置为2,并且放回true告知上一阶的寻路对象
                    return true;
                } else if (getWay(arr, i, j - 1)) {
                    //找到下一个路径是2 然后说明路通了,把自身设置为2,并且放回true告知上一阶的寻路对象
                    return true;
                } else {
                    arr[i][j] = 3;
                    return false;
                }
            } else {//否则其他情况是走不通的 1障碍物 2 已经走过的不能走 3 死路不能走
                return false;
            }


        }
    }
}