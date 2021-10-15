import java.util.*;
import java.util.HashMap;

class Solution {
    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        // HashSet<String> duplicatedName = new HashSet<String>();
        Map<String, Boolean> checkCompletion = new HashMap();
        Map<String, Integer> duplicatedName = new HashMap();
        for (String p : participant) {
            duplicatedName.put(p, 0);
        }
        for (String p : participant) {
            if (checkCompletion.containsKey(p)) {
                duplicatedName.put(p, duplicatedName.get(p) + 1);
            }
            checkCompletion.put(p, false);
        }
        for (String c : completion) {
            if (checkCompletion.get(c) == true) {
                duplicatedName.put(c, duplicatedName.get(c) - 1);
            }
            checkCompletion.put(c, true);
        }
        for (String key : checkCompletion.keySet()) {
            if (checkCompletion.get(key) == false) {
                answer = key;
            }
        }
        if (answer == "") {
            for (String d : duplicatedName.keySet()) {
                if (duplicatedName.get(d) != 0) {
                    answer = d;
                }
            }
        }
        return answer;
    }
}