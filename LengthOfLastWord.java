public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        int length = 0;
        int i = s.length() - 1;

        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }

    public static void main(String[] args) {
        LengthOfLastWord solution = new LengthOfLastWord();

        System.out.println(solution.lengthOfLastWord("Hello World"));                 // 5
        System.out.println(solution.lengthOfLastWord("   fly me   to   the moon  ")); // 4
        System.out.println(solution.lengthOfLastWord("luffy is still joyboy"));       // 6
    }
}
