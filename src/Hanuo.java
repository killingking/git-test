public class Hanuo {
    public static void main(String[] args) {
        Hanuo hanuo = new Hanuo();
        //hanuo.move(4, 'A', 'B', 'C');
        hanuo.moveHano(5,'A','B','C');
    }

    //汉诺塔规则:3层
    //TA->B F(C->A) TB->C FA->C
    //方法的入参为层数 移动源 移动目标
    //上面不好使,步骤多了
    //n层 F(A->B)  T(A->C) F(B->C) 即可
    public void moveHano(int n, char a, char b, char c) {
        if (n == 1) {
            System.out.println(a + "->" + c);
        } else {
            moveHano(n - 1, a, c, b);//F(A->B)
            System.out.println(a + "->" + c);//T(A->C)
            moveHano(n - 1, b, a, c);//F(B->C)
        }
    }

    public void move(int n, char a, char b, char c) {
        if (n == 1) {
            System.out.println(a + "->" + c);

        } else if (n == 2) {
            System.out.println(a + "->" + b);
            System.out.println(a + "->" + c);
            System.out.println(b + "->" + c);
        } else {
            move(n - 1, a, b, c);
            System.out.println(a + "->" + b);
            move(n - 1, c, b, a);
            System.out.println(b + "->" + c);
            move(n - 1, a, b, c);
        }
    }
}
