public class RecursionFeibo {
    public int feiBo(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        } else {
            return feiBo(n - 1) + feiBo(n - 2);
        }
    }

    public int ectPeach(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return (ectPeach(n - 1)  + 1) * 2;
        }
    }
}
