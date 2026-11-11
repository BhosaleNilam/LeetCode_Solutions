public class SqrtX {

    public int mySqrt(int x) {
        if (x < 2) {
            return x;
        }

        int left = 1;
        int right = x / 2;
        int ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long square = (long) mid * mid;

            if (square == x) {
                return mid;
            } else if (square < x) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        SqrtX solution = new SqrtX();

        System.out.println(solution.mySqrt(4));  // 2
        System.out.println(solution.mySqrt(8));  // 2
        System.out.println(solution.mySqrt(16)); // 4
    }
}
