
// import java.util.Arrays;
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zeroNum = 0;
        int correct = 0;
        // v lottos, sin_nums 정렬시키기

        // Arrays.sort(lottos);
        // Arrays.sort(win_nums);

        // v a = 현재 0의 개수 구하기 (if a = 0도 포함)
        for (int i = 0; i < lottos.length; i++)
            if (lottos[i] == 0)
                zeroNum++;
        // v b = lottos에서 0을 제외하고 맞은 숫자 구하기
        for (int i = 0; i < win_nums.length; i++) {
            for (int k = 0; k < lottos.length; k++)
                if (win_nums[i] == lottos[k]) {
                    correct++;
                }
        }

        // 최고 순위 b += a , 최저 순위 b
        // 6이면 1, 5이면 2, 4이면 3, 3이면 4, 2이면 5, 1/0이면 6
        // 춘 개수하고 순위하고 별개
        int min = correct;
        int max = correct + zeroNum;

        int maxPrize = 7 - max;
        int minPrize = 7 - min;

        if (minPrize == 7)
            minPrize = 6;
        if (maxPrize == 7)
            maxPrize = 6;

        answer[0] = maxPrize;
        answer[1] = minPrize;

        return answer;
    }
}