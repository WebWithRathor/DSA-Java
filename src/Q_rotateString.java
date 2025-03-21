public class Q_rotateString {
    public static boolean rotateString(String s, String goal) {

        for (int i = 0; i < s.length(); i++) {
            StringBuilder sb = new StringBuilder();
            char ch = s.charAt(i);
            if (ch != goal.charAt(0)) continue;
            sb.append(reverse(goal.substring(0,s.length()-i).toCharArray()));
            sb.append(reverse(goal.substring(s.length()-i).toCharArray()));
            sb.reverse();
            System.out.println(sb);
            if (s.equals(sb.toString())) return true;
        }
        return false;
    }
    public static String reverse(char[] crr) {
        StringBuilder sb = new StringBuilder();
        for(int i = crr.length-1;i>=0;i--){
            sb.append(crr[i]);
        }
//        System.out.println(sb);
        return sb.toString();
    }

    public static void main(String[] args) {
//        System.out.println(rotateString("abcde","bcdea"));
        System.out.println(rotateString("abcde","abced"));
    }
}
