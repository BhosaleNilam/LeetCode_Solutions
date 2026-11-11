public class FirstUniqueCharacterInAString {

    public int firstUniqChar(String s) {
        int[] count = new int[26];

        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        FirstUniqueCharacterInAString solution = new FirstUniqueCharacterInAString();

        System.out.println(solution.firstUniqChar("leetcode"));     // 0
        System.out.println(solution.firstUniqChar("loveleetcode")); // 2
        System.out.println(solution.firstUniqChar("aabb"));         // -1
    }
}
