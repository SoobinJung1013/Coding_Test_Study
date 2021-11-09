class Solution {
    public String solution(String[] log) {
        String answer = "";
        int studyTime = 0; // 누적 공부 시간 (분)
        
        for (int i = 0; i < log.length-1; i += 2) {
            int tempHour = Integer.parseInt(log[i+1].substring(0,2)) 
                - Integer.parseInt(log[i].substring(0,2)); 
            int tempMin = Integer.parseInt(log[i+1].substring(3,5)) 
                - Integer.parseInt(log[i].substring(3,5));
            
            if (tempMin < 0) {
                tempHour = tempHour -1;
                tempMin = -(tempMin);
            }
            
            int total = 60*tempHour + tempMin;
            
            if (total < 5)
                total = 0;
            if (total > 105)
                total = 105;
            
            studyTime += total;
        }
        
        // 분을 시간 분으로 변환 
        String hour = Integer.toString(studyTime / 60);
        if ( Integer.parseInt(hour)/10 == 0) 
            hour = '0' + hour;
        String min = Integer.toString(studyTime % 60);
        if ( Integer.parseInt(min)/10 == 0)
            min = '0' + hour;
        // Integer.toString();
        
        answer = hour + ":" + min;
        return answer;
    }
}