class Solution {
    public String solution(double time, String[][] plans) {
        String answer = "";
        
        for(int i = 0; i < plans.length; i++) {
            String country = plans[i][0]; //홍콤
            int start = Integer.parseInt(plans[i][1].substring(0,plans[i][1].length()-2)); // 11PM -> 11
            int arrival = Integer.parseInt(plans[i][2].substring(0,plans[i][2].length()-2)); // 9AM -> 11
            double left = time; //3.5
            
            /* 출발 */
            if ( (plans[i][1].substring(plans[i][1].length() -2,plans[i][1].length())) == "AM" ) { // AM 인 경우 
                continue; //휴가 시간 초과
            }
            else { // PM인 경우
                // 1pm, 2pm일 경우  휴가 시간 초과 
                if (start >= 6){
                } else {
                    if (start < 3) {
                        continue;
                    }
                    else {
                        left = left - (6 - start);
                    }
                }
            }
            
            /* 도착 */
            if ( (plans[i][2].substring(plans[i][2].length() -2,plans[i][2].length())).equals("AM") ) { // AM 인 경우 

            } else { // PM인 경우 1, 2, 3, 4
                // 도착시간이 5pm 이상인 경우 휴가 시간 초과
                if (arrival == 12 || arrival ==1 ){
                    // 문제될거 없음
                }
                if (arrival > 4) {
                    continue;
                }
                
                // 도착시간이 2pm, 3pm, 4pm인경우 휴가시간 제외
                    // (월요일 출근시간 - 도착시간) -> (-)일경우  left에서 뺴줌 (그대로 더해줌)
                if ( arrival < 5){
                    left = left - (arrival - 1);
                }
            }

            
            if(left >= 0 ) {
                answer = plans[i][0];
                break;
            }
        }
        
        return answer;
    }
}