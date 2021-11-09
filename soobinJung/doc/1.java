class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[3];
        int c1= 0; //3
        int c2 = 0; //2
        int c3 = 0; //1
        
        // 1,2,3 각각의 개수 세기
        for (int i =0; i < arr.length; i++) {
            if (arr[i] == 1) {
                c1++;
            } else if (arr[i] == 2 ) {
                c2++;
            } else {
                c3++;
            }
        }
        
        // 최대값 찾기
        int max = c1;
        if (c2 > c1) {
            if (c2 >= c3) {
                max = c3;
            } else {
                max =c2;
            }
        }
        if (c3 > c1) {
            if(c3 >= c2) {
                max = c3;
            } else {
                max = c2;
            }
        }
        
        // 필요한 갯수 구하시 
        answer[0] = max - c1;
        answer[1] = max - c2;
        answer[2] = max - c3;
        
        return answer;
    }
}