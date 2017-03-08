package leetcode_algorithm.Climbing_Statirs;

/**
 * You are climbing a stair case. It takes n steps to reach to the top.
 * <p>
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * <p>
 * Note: Given n will be a positive integer.
 */

public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().climbStairs(30));
        System.out.println(new Solution().climbStairs(44));
    }

    /**
     * ���˽ⷨ
     *
     * @param n
     * @return
     */
    public int climbStairs(int n) {
        int preStep1 = 0;
        int preStep2 = 1;
        for (int i = 1; i <= n; i++) {
            preStep2 = preStep1 + preStep2;
            preStep1 = preStep2 - preStep1;
        }
        return preStep2;
    }


}
