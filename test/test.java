package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int L  = sc.nextInt();
        int R  = sc.nextInt();

        int max = 0;
        max = maxMoney(L, R);
        System.out.println(max);
    }
    public static int maxMoney(int L, int R) {
        if (Math.max(L, R) < 10) {
            if (L <= R) {
                return R*R;
            } else  {
                return L*L;
            }
        }
        return 0;
    }
}
