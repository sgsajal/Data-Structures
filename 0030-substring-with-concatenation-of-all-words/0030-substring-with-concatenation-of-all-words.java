import java.util.*;

class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        if (s == null || s.length() == 0 || words == null || words.length == 0)
            return result;
        
        int wordLength = words[0].length();
        int totalLength = wordLength * words.length;
        Map<String, Integer> wordFreqMap = new HashMap<>();
        
        for (String word : words)
            wordFreqMap.put(word, wordFreqMap.getOrDefault(word, 0) + 1);
        
        for (int i = 0; i <= s.length() - totalLength; i++) {
            String substr = s.substring(i, i + totalLength);
            if (isValidSubstring(substr, wordFreqMap, wordLength))
                result.add(i);
        }
        
        return result;
    }
    
    private boolean isValidSubstring(String substr, Map<String, Integer> wordFreqMap, int wordLength) {
        Map<String, Integer> substrMap = new HashMap<>();
        for (int i = 0; i < substr.length(); i += wordLength) {
            String word = substr.substring(i, i + wordLength);
            substrMap.put(word, substrMap.getOrDefault(word, 0) + 1);
        }
        return substrMap.equals(wordFreqMap);
    }
}
