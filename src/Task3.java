public class Task3 {
    public static void main(String[] args) {
        String text = "mr blue sky";
        String reverseText = reverseWords(text);
        System.out.println(reverseText);
    }
    public static String reverseWords(String s) {
        StringBuilder word = new StringBuilder();
        int end = s.length() - 1;
        while (end >= 0) {
            if (s.charAt(end) == ' ') {
                continue;
            }
            int start = end - 1;
            while (start >= 0 && s.charAt(start) != ' ') {
                start -= 1;
            }
            word.append(" ");
            word.append(s.substring(start + 1, end + 1));
            end = start - 1;
        }
        if (word.length() > 0) {
            word.deleteCharAt(0);
        }
        return word.toString();
    }
}
