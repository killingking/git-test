
import java.util.Scanner;

import static java.lang.System.in;

public class Starts {
    public static void main(String[] args) {
        double sum = 1d;
        for (int i = 2; i <= 100; i++) {
            if (i % 2 == 0) {
                sum = sum - 1.0 / i;
            } else {
                sum = sum + 1.0 / i;
            }
        }
        System.out.println(sum);

        int xsum = 0;
        for (int i = 1; i <= 100; i++) {
            int tsum = 0;
            for (int j = 1; j <= i; j++) {
                tsum += j;
            }
            xsum += tsum;
        }
        System.out.println(xsum);

        int totalLevel = 0;
        Scanner MyScanner = new Scanner(System.in);
        totalLevel = MyScanner.nextInt();
        for (int i = 1; i <= totalLevel; i++) {
//            for (int j = 1; j <= i * 2 + 1; j++) {
//                System.out.print("*");
//            }
            for (int j = 1; j <= totalLevel * 2 - 1; j++) {
                //System.out.print(i);
                // System.out.print("*");
                if (j == totalLevel + 1 - i || j == totalLevel - 1 + i || i == totalLevel) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
