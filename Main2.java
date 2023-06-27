public class Main2 {
    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        int left = 0; // Pointer to track the position for non-zero elements

        // Iterate through the array
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                // If the current element is non-zero, swap it with the left pointer
                int temp = nums[i];
                nums[i] = nums[left];
                nums[left] = temp;

                left++; // Increment the left pointer
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {0};

        System.out.print("Input: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        moveZeroes(nums);

        System.out.print("\nOutput: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
