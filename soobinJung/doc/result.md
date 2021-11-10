# 1

```java
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
```

# 2

```java
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
```

# 3

```java
import java.util.*;
class Solution {
    public int solution(String[] ings, String[] menu, String[] sell) {
        int answer = 0;

        //재료는 hashmap으로 만들거임
        HashMap<String, Integer> ingHM = new HashMap<>();
        for (String s : ings) {
            String[] tempIng = s.split(" "); //['x', '25']
            ingHM.put(tempIng[0], Integer.parseInt(tempIng[1]));
        }

        // 메뉴별 필요한 재료비, 순이익 구하기
        HashMap<String, Integer> menuHM = new HashMap<>(); //메뉴이름, 순이익
        for (String s : menu){
            String[] tempMenu = s.split(" "); // ['AAAA', 'xyxy', '15']
            int cost = 0; // 재료비

            for (int i =0; i < tempMenu[1].length(); i++) { //xyxy
                cost += ingHM.get(Character.toString(tempMenu[1].charAt(i)));
            }
            menuHM.put(tempMenu[0], Integer.parseInt(tempMenu[2]) - cost);
        }

        // 총 수익 구하기 = 순익 * 판매량
        for (String s : sell) {
            String[] tempSell = s.split(" "); // ['BBBB', '3']
            answer += (menuHM.get(tempSell[0])) * Integer.parseInt(tempSell[1]);
        }
        return answer;
    }
}
```

# 4

```java
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
```

# 5

```java
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
```

# 6

```java
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
```
