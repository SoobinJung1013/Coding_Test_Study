import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer;
        final int COMMANDSNUM = commands.length;
        answer = new int[COMMANDSNUM];
        int[] cut = {}; 
        //index 기준
        int i =0 ;
        int j =0;
        int k =0;
        
        for (int c =0; c < commands.length; c ++) {
            i = commands[c][0] -1;
            j = commands[c][1] -1;
            k = commands[c][2] -1;
            cut = Arrays.copyOfRange(array, i, j+1);
            Arrays.sort(cut);
            answer[c] = cut[k];
        }
        return answer;
    }
}