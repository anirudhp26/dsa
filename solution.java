import java.util.HashSet;

public class solution {

    public String longestPalindrome(String s) {
        int i = 0;
        int j = 0;
        String str = "";

        while (j<s.length()) {
            if (isPalindrome(s.substring(i, j))) {
                if (s.substring(i, j).length() > max) {
                    max = s.substring(i, j).length();
                    str = s.substring(i, j);
                }
                i++;
            }
            else{
                j++;
            }
        }

        return str;
    }

    public int lengthofLongestSubString(String s) {
        HashSet<Character> mp = new HashSet();
        int i = 0;
        int j = 0;
        int max = 0;
        while(j<s.length()){
            if (mp.contains(s.charAt(j))) {
                mp.remove(s.charAt(i));
                i++;
            }
            mp.add(s.charAt(j));
            max = Math.max(mp.size(), max);
            j++;
        }
        return max;
    }

    public boolean isPalindrome(String s){
        s = s.toLowerCase();
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    
}
