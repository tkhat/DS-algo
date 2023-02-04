package concatenationofarray;

public class GetConcatenation {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];
        int ansIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            ans[ansIndex] = nums[i];
            ansIndex++;
        }
        for (int i = 0; i < nums.length; i++) {
            ans[ansIndex] = nums[i];
            ansIndex++;
        }
        return ans;
    }
}
