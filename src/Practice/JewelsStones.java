package Practice;

public class JewelsStones {
    public static void main(String[] args) {
        String pref= "aA";
        String str = "aAAbbbbb";
        int count=0;
        for(char ch : str.toCharArray()){
            if(pref.contains(ch+""))count++;
        }
        System.out.println(count);
    }
}
