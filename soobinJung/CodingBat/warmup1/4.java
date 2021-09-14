class Solution {
    public int diff21(int n) {
        int diff;
        diff = 21 - n;
        if (diff >= 0) {
            return diff;
        } else {
            return (-diff) * 2;
        }
    }
}

// 내가 생각한 문제 의도
// 풀이 설명
// 다른 풀이