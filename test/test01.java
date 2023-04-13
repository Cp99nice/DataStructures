package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] res = goodNum(n, k);

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]);
        }

        // System.out.println(res);
    }

    public static int[] goodNum(int n, int k) {
        int[] arr = new int[n];
        /*if (n % 2 == 0) {
            n = n / 2;
        } else {
            n = n / 2 + 1;
        }*/

        arr[0] = n - k;
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) {
                arr[i] = arr[i - 2] + 2;
                k--;
                if ( k == 0 ) {
                    int x = i + 1;
                    while (x < n) {
                        arr[x++] = k--;
                    }
                    break;
                }
            } else {
                arr[i] = arr[i - 1] - 1;
            }
        }
        return arr;

    }
}
