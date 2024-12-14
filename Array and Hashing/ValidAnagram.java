import java.util.*;

public class ValidAnagram{

    public static void main(String[] args) {
        String s = "Anagram";
        String t = "Nagaram";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t){
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        
        for (int i = 0; i < sChar.length; i++) {
            sChar[i] = Character.toLowerCase(sChar[i]);
        }

        for (int i = 0; i < tChar.length; i++) {
            tChar[i] = Character.toLowerCase(tChar[i]);
        }

        Arrays.sort(sChar);
        Arrays.sort(tChar);

        return Arrays.equals(sChar, tChar);
    }
}
