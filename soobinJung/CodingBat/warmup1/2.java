class Solution {
    public int sumDouble(int a, int b) {
        if (a == b) {
            return (a + b) * 2;
        } else {
            return a + b;
        }
    }

}

// 내가 생각한 문제 의도
// 풀이 설명
// 다른 풀이
/*
 * public int sumDouble(int a, int b) { // Store the sum in a local variable int
 * sum = a + b;
 * 
 * // Double it if a and b are the same if (a == b) { sum = sum * 2; }
 * 
 * return sum; }
 */
// 풀이들 보면 if-else 로 안꼬아둠
// 논리도 좋은데, 직관적이게 표현을 함.
// 풀이랑 비교하면 내가 쓴 답은 비교적 가독성이 떨어짐
// 중첩이랑 if-else 줄이고 직관적으로 생각하고 작성 ㄱ ㄱ