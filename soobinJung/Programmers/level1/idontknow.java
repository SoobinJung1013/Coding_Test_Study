import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        // 1
        String temp = Long.toString(n);
        char[] StringtoChar = temp.toCharArray();
        Arrays.sort(StringtoChar);

        StringBuilder sbf = new StringBuilder("");

        /*
         * Appends string representation of char array to this StringBuilder
         */
        sbf.append(StringtoChar);

        // temp = Arrays.toString(StringtoChar);
        // StringBuffer sb = new StringBuffer(temp);
        String reversedTemp = sbf.reverse().toString();
        answer = Long.parseLong(reversedTemp);
        return answer;
        // 2
        // char[] ns = new char[temp.length()];
        // for (int i = 0; i < temp.length(); i++) {
        // // ns[i] = temp.charAt(i) - '0';
        // ns[i] = temp.charAt(i);
        // // ns[i] = Integer.parseInt(temp.charAt(i));
        // }
        // // Arrays.sort(ns, Collections.reverseOrder());

        // 3
        // String temp = Long.toString(n);
        // String as = "";
        // for(int i = 0; i < temp.length(); i++){
        // char max = temp.charAt(i);// 문자열은 index안쓰로 charAt쓴다 ㅂㅅ아 .. 또까먹냐
        // for (int j = i; j < temp.length()l; j++){
        // if ( temp.charAt(j) > max) {
        // char temptemp = temp.charAt(j);
        // temp.replace(i,);
        // }
        // }
        // // as = as + temp.charAt(i);
        // }
        // answer = Long.parseLong(as);

    }
}