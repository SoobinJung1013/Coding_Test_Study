import java.util.HashMap;
import java.util.Map;

class Solution { 
    public boolean solution(String[] phoneBook) { 
        boolean answer = true; 
        HashMap<String, Integer> map = new HashMap<>(); 
        for(int i = 0; i < phoneBook.length; i++) 
            map.put(phoneBook[i], i); 
        for(int i = 0; i < phoneBook.length; i++) { 
            for(int j = 1; j < phoneBook[i].length(); j++) { 
                if(map.containsKey(phoneBook[i].substring(0,j))) { 
                    answer = false; return answer; 
                } 
            } 
        } 
        return answer; 
    } 
}
// 위의 코드 성공함.

import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        for (String phoneIndex : phone_book) {
            for (String phoneCompare : phone_book) { // 자기자신 비교 제거
                if (phoneIndex.length() < phoneCompare.length()) {
                    // 문자열 비교할 때, == 랑 equals비교해서 잘 쓰기
                    if (phoneIndex.equals(phoneCompare.substring(0, phoneIndex.length()))) {
                        answer = false;
                        return answer;
                    }
                }
            }
        }
        return answer;
    }
}
// 위의 코드 실행 시간 에러 뜸.

class Solution {
    public boolean solution(String[] phoneBook) {
        for (int i = 0; i < phoneBook.length - 1; i++) {
            for (int j = i + 1; j < phoneBook.length; j++) {
                if (phoneBook[i].startsWith(phoneBook[j])) {
                    return false;
                }
                if (phoneBook[j].startsWith(phoneBook[i])) {
                    return false;
                }
            }
        }
        return true;
    }
}
// 효율성 씨발 뭔데