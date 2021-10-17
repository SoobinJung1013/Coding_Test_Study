import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) { // 2차원 배열 vs 1차원배열
        int answer = 1;
        HashMap<String, Integer> hm = new HashMap();
        for (int i = 0; i < clothes.length; i++)
            hm.put(clothes[i][1], hm.getOrDefault(clothes[i][1], 1) + 1);
        for (String kinds : hm.keySet())
            answer *= hm.get(kinds);
        return answer - 1;
    }
}

// import java.util.*;
// import java.util.HashMap;

// // 문제는 풀었는데, 속도가 느림
// class Solution {
// public int solution(String[][] clothes) { // 2차원 배열 vs 1차원배열
// int answer = 0;
// Map<String, Integer> hm = new HashMap();

// for (int i = 0; i < clothes.length; i++) {
// hm.put(clothes[i][1], 1);
// }
// for (int i = 0; i < clothes.length; i++) {
// hm.put(clothes[i][1], hm.get(clothes[i][1]) + 1);
// }

// int xCal = 1;
// for (String kinds : hm.keySet()) {
// xCal = xCal * hm.get(kinds);
// }
// answer = answer + xCal;
// answer += xCal;
// answer = answer - 1;

// return answer;
// }
// }

// import java.util.HashMap;

// class Solution {
// public int solution(String[][] clothes) { // 2차원 배열 vs 1차원배열
// int answer = 1;
// HashMap<String, Integer> hm = new HashMap();
// for (int i = 0; i < clothes.length; i++) {
// hm.put(clothes[i][1], 1);
// }
// for (int i = 0; i < clothes.length; i++) {
// hm.put(clothes[i][1], hm.get(clothes[i][1]) + 1);
// }
// for (String kinds : hm.keySet()) {
// answer *= hm.get(kinds);
// }
// return answer - 1;
// }
// }

// 코드 똑같은데, 길이 줄인거

// import java.util.HashMap;
// import java.util.Iterator;
// class Solution {
// public int solution(String[][] clothes) {
// int answer = 1;
// HashMap<String, Integer> map = new HashMap<>();
// for(int i=0; i<clothes.length; i++){
// String key = clothes[i][1];
// if(!map.containsKey(key)) {
// map.put(key, 1);
// } else {
// map.put(key, map.get(key) + 1);
// }
// }
// Iterator<Integer> it = map.values().iterator();
// while(it.hasNext()) {
// answer *= it.next().intValue()+1;
// }
// return answer-1;
// }
// }

// 풀이는 똑같은데 다르게 표현

// import java.util.*;
// import static java.util.stream.Collectors.*;

// class Solution {
// public int solution(String[][] clothes) {
// return Arrays.stream(clothes)
// .collect(groupingBy(p -> p[1], mapping(p -> p[0], counting())))
// .values()
// .stream()
// .collect(reducing(1L, (x, y) -> x * (y + 1))).intValue() - 1;
// }
// }

// new