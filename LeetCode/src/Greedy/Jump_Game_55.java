package Greedy;


public class Jump_Game_55 {

    public static void main(String[] args) {
//        int nums[] = {2, 3, 1, 1, 4};/////-----TRUE
//        int nums[] = {3, 2, 1, 0, 4};/////-----FALSE
//        int nums[] = {0, 1};/////-----
//        int nums[] = {1};/////-----
//        int nums[] = {1, 3, 2};/////-----FALSE
//        int nums[] = {1, 0, 1, 0};/////-----FALSE
        int nums[] = {2,1, 0, 0};/////-----FALSE
        
        System.out.println("Result = " + canJump(nums));
    }

    public static boolean canJump(int[] nums) {
        boolean result = false;

        int jumpLength = 0;
        if (nums.length == 1 ) {
            return true;
        }

        for (int i = jumpLength; i < nums.length; i = i + nums[i]) {
//            System.out.println(nums[i]);

            if (nums[i] == 0) {
                return false;
            }

            jumpLength = i + nums[i];

            if (jumpLength > nums.length) {
                break;
            }
            if (jumpLength >= nums.length - 1) {
                return true;
            }
//            System.out.println("jumpLength = " + jumpLength);
        }
        if (jumpLength >= nums.length - 1) {
            return true;
        }
        if (nums[nums.length - 1] == 0) {
            return true;
        }
        return result;
    }
}
