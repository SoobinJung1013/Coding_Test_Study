import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer;
        ArrayList<Integer> temp = new ArrayList<>();

        //앞 뒤 문자 같은 경우 앞에 있는걸 뒤로 보내는 동작
        while ( s.charAt(0) == s.charAt(s.length()-1) ) {
            s = s.substring(1, s.length()) + s.substring(0,1);
        } 
        
        int index = 0;
        for( int i =0; i < s.length(); i++ ) {
            if (i == 0){
                temp.add(index, 1);
                continue;
            }
            if (s.charAt(i) == s.charAt(i - 1)) {
                temp.set(index, temp.get(index)+1); //here
                continue;
            } else {
                index++;
                temp.add(index, 1);
            }
        }
        
        Integer[] arr = new Integer[temp.size()];
        arr = temp.toArray(arr);

        answer = Arrays.stream(arr).mapToInt(Integer::intValue).toArray(); 
        
        Arrays.sort(answer);
        
        return answer;
    }
}