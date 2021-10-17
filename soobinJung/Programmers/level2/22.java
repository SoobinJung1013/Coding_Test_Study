import java.util.*;
import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) { // 2차원 배열 vs 1차원배열
        int answer = 0;
        Map<String, Integer> hm = new HashMap();

        for (int i = 0; i < clothes.length; i++) {
            hm.put(clothes[i][1], 1);
        }
        for (int i = 0; i < clothes.length; i++) {
            hm.put(clothes[i][1], hm.get(clothes[i][1]) + 1);
        }

        int xCal = 1;
        for (String kinds : hm.keySet()) {
            xCal = xCal * hm.get(kinds);
        }
        answer = answer + xCal;
        answer = answer - 1;

        return answer;
    }
}