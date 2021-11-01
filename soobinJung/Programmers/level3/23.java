import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        // 장르, 곡 번호, 재생 횟수
        HashMap<String, HashMap<Integer, Integer>> genAndNumAndPlays = new HashMap<>();

        // 재생 횟수, 장르
        HashMap<Integer, String> totalPlaysAndGen = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            if (genAndNumAndPlays.containsKey(genres[i])) {
                HashMap<Integer, Integer> temp1 = genAndNumAndPlays.get(genres[i]);
                // 전체 재생 저장
                temp1.put(-1, plays[i] + temp1.get(-1));

                // 1, 2위 곡만 저장
                Map.Entry<Integer, Integer> rank3thEntry = null;
                for (Map.Entry<Integer, Integer> entry : temp1.entrySet())
                    if (temp1.size() == 3 && !entry.getKey().equals(-1))
                        if (entry.getValue() < plays[i])
                            if (rank3thEntry == null)
                                rank3thEntry = entry;
                            else if (rank3thEntry.getValue() > entry.getValue())
                                rank3thEntry = entry;

                if (rank3thEntry != null) {
                    temp1.remove(rank3thEntry.getKey());
                    temp1.put(i, plays[i]);
                } else if (temp1.size() != 3)
                    temp1.put(i, plays[i]);
                genAndNumAndPlays.put(genres[i], temp1);
            } else {
                HashMap<Integer, Integer> temp = new HashMap<>();
                // 전체 재생 저장
                temp.put(-1, plays[i]);
                temp.put(i, plays[i]);
                genAndNumAndPlays.put(genres[i], temp);
            }
        }

        // 총 재생, 장르 해시맵 넣기
        for (Map.Entry<String, HashMap<Integer, Integer>> temp : genAndNumAndPlays.entrySet())
            for (Map.Entry<Integer, Integer> temp2 : temp.getValue().entrySet())
                if (temp2.getKey().equals(-1))
                    totalPlaysAndGen.put(temp2.getValue(), temp.getKey());

        // 재생 순 정렬, 임시 변수
        Object[] temp = totalPlaysAndGen.keySet().toArray();
        Arrays.sort(temp, Collections.reverseOrder());

        // 배열용
        ArrayList<Integer> a = new ArrayList<>();

        for (Object test : temp) {
            // 랭크 카운트용 임시
            Map.Entry<Integer, Integer> rankEntry = null;
            for (Map.Entry<Integer, Integer> entry : genAndNumAndPlays.get(totalPlaysAndGen.get(test)).entrySet())
                if (!entry.getKey().equals(-1))
                    if (genAndNumAndPlays.get(totalPlaysAndGen.get(test)).size() == 2) {
                        a.add(entry.getKey());
                    } else if (rankEntry == null)
                        rankEntry = entry;
                    else {
                        if (rankEntry.getValue() > entry.getValue()) {
                            a.add(rankEntry.getKey());
                            a.add(entry.getKey());
                        } else {
                            if (rankEntry.getValue().equals(entry.getValue()) && rankEntry.getKey() < entry.getKey()) {
                                a.add(rankEntry.getKey());
                                a.add(entry.getKey());
                            } else {
                                a.add(entry.getKey());
                                a.add(rankEntry.getKey());
                            }
                        }
                    }
        }

        // System.out.println(a);
        // for (Map.Entry<String, HashMap<Integer, Integer>> temp1 :
        // genAndNumAndPlays.entrySet()) {
        // System.out.println(temp1.getKey() + " ___ " + temp1.getValue().get(-1));
        // for (Map.Entry<Integer, Integer> temp2 : temp1.getValue().entrySet()) {
        // if (!temp2.getKey().equals(-1))
        // System.out.println(" " + temp2.getKey() + " ___ " + temp2.getValue());
        // }
        // }

        int[] answer = new int[a.size()];
        for (int i = 0; i < a.size(); i++) {
            answer[i] = a.get(i);
        }
        return answer;
    }
}