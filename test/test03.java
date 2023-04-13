package test;

import java.util.Scanner;
import java.util.HashMap;

public class test03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ans = zhengNum(n);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        //System.out.println(ans);
    }

    public static int[] zhengNum(int n){
        int[] res = new int[2];
        HashMap<Integer, int[]> map = new HashMap<>();
        int b = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                int sum = 1;
                for (int z = 1; z < i; z++) {
                    sum *= z;
                }
                int a = Math.abs(sum * j - j - n );
                res[0] = i;
                res[1] = j;
                map.put(a, res);
                b = Math.min(a, b);
            }
        }
        res = map.get(b);
        return res;
    }
}