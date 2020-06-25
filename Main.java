import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	HashMap<Integer,Integer> mao = new HashMap<Integer,Integer>();
        int n = 6;
        int m = 2;
        int[] array = {0,-1,4,-2,3,-2,3};
        int res = 0;
        int[] dp = new int[n + 1];
        int[] maxArray = new int[n + 1];
        for (int i = 1; i <= m; i++) {
            res = Integer.MIN_VALUE;
            for (int j = i; j <= n; j++) {
                dp[j] = Math.max(dp[j - 1], maxArray[j - 1]) + array[j];

                maxArray[j-1] = res;
                if (res < dp[j]) res = dp[j];
            }
        }

        System.out.println(res);
    }
}