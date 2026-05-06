class Solution {

    public int secondLargestElement(int[] nums) {

        int largest = nums[0];
        int slargest = Integer.MIN_VALUE;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] > largest) {
                slargest = largest;
                largest = nums[i];
            }

            else if (nums[i] < largest && nums[i] > slargest) {
                slargest = nums[i];
            }
        }

        return slargest;
    }
}
// Time Complexity: O(n)
// Space Complexity: O(1)
