import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }

        Set<Integer> result = new HashSet<>();
        for (int num : nums2) {
            if (set1.contains(num)) {
                result.add(num);
            }
        }

        int[] ans = new int[result.size()];
        int i = 0;
        for (int num : result) {
            ans[i++] = num;
        }
        return ans;
    }

    public static void main(String[] args) {
        IntersectionOfTwoArrays solution = new IntersectionOfTwoArrays();

        System.out.println(Arrays.toString(
                solution.intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2}))); // [2]
        System.out.println(Arrays.toString(
                solution.intersection(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4}))); // [4, 9]
    }
}
