class Solution {
     private static final int MAX = 10000;

    public int deleteAndEarn(int[] nums) {
        int[] count = new int[MAX + 1];
        int maxNum = 0;

        for (int num: nums) {
            count[num]++;
            maxNum = Math.max(maxNum, num);
        }

        return deleteAndEarn(maxNum, count);
    }

    private int deleteAndEarn(int maxNum, int[] count) {
        int[] maxPoints = new int[MAX + 1];

        for (int num = 1; num <= maxNum; num++) {
            maxPoints[num] = Math.max(maxPoints[num == 1 ? 0 : num - 2] + (count[num] * num),
                    maxPoints[num - 1]);
        }

        return maxPoints[maxNum];
    }
    
}