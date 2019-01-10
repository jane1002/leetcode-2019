package google;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * link: https://leetcode.com/problems/find-and-replace-pattern/
 */
public class ReplacePattern890 {

    /**
     *
     * @param words
     * @param pattern
     * @return list of string which match the patter
     */
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> res = new ArrayList<>();

        for(int i = 0; i < words.length; i++) {
            if(match(words[i], pattern)) {
                res.add(words[i]);
            }
        }

        return res;
    }

    /**
     * match function to check if the word match the pattern
     * @param word
     * @param pattern
     * @return boolean match or not
     */
    private boolean match(String word, String pattern) {
        char[] patternArr = pattern.toCharArray();
        char[] wordArr = word.toCharArray();

        Map<Character, Character> map = new HashMap<>();

        if(patternArr.length != wordArr.length) {
            return false;
        }

        for(int i = 0; i < wordArr.length; i++) {
            if(map.containsKey(patternArr[i])) {
                char cur = map.get(patternArr[i]);
                if(cur != wordArr[i])
                    return false;
            } else {
                map.put(patternArr[i], wordArr[i]);
            }
        }

        boolean[] seen = new boolean[26];

        //for example: abb, ccc, to make sure a-> c, b not map to c also
        for(char c: map.values()) {
            if(seen[c - 'a']) {
                return false;
            }
            seen[c - 'a'] = true;
        }

        return true;
    }
}
