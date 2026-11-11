public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int insertPos = 0;

        for (int num : nums) {
            if (num != val) {
                nums[insertPos++] = num;
            }
        }

        return insertPos;
    }

    public static void main(String[] args) {
        RemoveElement solution = new RemoveElement();

        int[] nums1 = {3, 2, 2, 3};
        int k1 = solution.removeElement(nums1, 3);
        System.out.println(k1); // 2

        int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2};
        int k2 = solution.removeElement(nums2, 2);
        System.out.println(k2); // 5
    }
}
