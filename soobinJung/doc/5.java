class Solution {
    public int[][] solution(int rows, int columns) {
        int[][] answer = new int[rows][columns];
        int r = 1;
        int c = 1; // r-1
        answer[r-1][c-1] = 1;
        int cnt = 0; // 정사각형인 경우 종료 시키기
        int cnt2 = 0; //정사각형 아닌 경우 종료시키기 
        int l = rows;
        if (columns > rows)
            l = columns;
        
        while (true) { 
            int before = answer[r-1][c-1];
            
            if (answer[r-1][c-1]%2 == 0) { // 짝수라면
                if ( r == rows ) 
                    r = 1;
                else 
                    r = r + 1;
            } else { //홀수라면
                if (c == columns)
                    c = 1;
                else
                    c = c + 1;
            }
            answer[r-1][c-1] = before + 1;
            
            if (rows == columns) {
                cnt++;
                if (cnt >= (2*rows-1))
                    break;
            }
            if ( rows != columns) {
                cnt2++;
                if (cnt2 >= l*l)
                    break;
            }
            
        }
        return answer;
    }
}