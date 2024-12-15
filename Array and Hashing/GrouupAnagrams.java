//Given an array of strings strs, group all anagrams together into sublists. You may return the output in any order.
import java.util.*;
public class GrouupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {

        //sorting
        Map<String, List<String>> res = new HashMap<>();
        for (String s : strs) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedS = new String(charArray);
            res.putIfAbsent(sortedS, new ArrayList<>());
            res.get(sortedS).add(s);
        }
        return new ArrayList<>(res.values());

        //hashtable
        // for (String s : strs) {
        //     Map<String, List<String>> dupRes = new HashMap<>();
        //     int[] count = new int[26];
        //     for (char c : s.toCharArray()) {
        //         count[c - 'a']++;
        //     }
        //     String key = Arrays.toString(count);
        //     dupRes.putIfAbsent(key, new ArrayList<>());
        //     dupRes.get(key).add(s);
        // }
        // return new ArrayList<>(dupRes.values());
    }

    public static void main(String[] args) {
        String[] strs = {"act","pots","tops","cat","stop","hat"};
        System.out.println(groupAnagrams(strs));
    }
}
