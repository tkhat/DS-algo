package isAnagram;

import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.util.Arrays;
import java.util.HashSet;

public class IsAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] sChar = new char[s.length()];
        char[] tChar = new char[t.length()];
        for (int i = 0; i < s.length(); i++) {
            sChar[i] = s.charAt(i);
            tChar[i] = t.charAt(i);
        }
        Arrays.sort(sChar);
        Arrays.sort(tChar);

        for (int i = 0; i < s.length(); i++) {
            if (sChar[i] != tChar[i]) {
                return false;
            }
        }
        return true;
    }
}
