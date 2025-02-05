package Practice;

public class reverseString {
    public static void main(String[] args) {
        String str = "abcdefgh";
        char ch = 'd';
        StringBuilder sb = new StringBuilder();

        if (str.contains(ch + "")) {
            int j = str.indexOf(ch);
            int i = j;
            for(;j>=0;j--){
                sb.append(str.charAt(j));
            }
            sb.append(str.substring(i));
        }

        System.out.println(sb);

    }
}
