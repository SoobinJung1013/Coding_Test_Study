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