class Solution {
public int solution(int[] numbers) {
int answer = 45;

        for(int number : numbers) {
            answer -= number;
        }

        return answer;
    }

}

<!--
겪었던 문제점
처음에
Arrays.stream(numbers)
IntStream.of(a).anyMatch(x -> x == 4)
이거 썼는데 import 해줘야 하는지 모르고 계속 실행하다가 안되서 헤맸다.
-->
