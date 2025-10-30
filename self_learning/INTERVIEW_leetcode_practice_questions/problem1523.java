package leetcode;

public class problem1523 {
    static void main(String[] args) {
        int[] nums = {3,1,5,4,2};
        System.out.println(minNumberOperations(nums));
    }

    static int minNumberOperations(int[] target) {

        int result = target[0]; // need target[0] operations for the first element
        for (int i = 1; i < target.length; i++) {
            if (target[i] > target[i - 1]) {
                result += target[i] - target[i - 1];
            }
        }
        return result;


    }
}