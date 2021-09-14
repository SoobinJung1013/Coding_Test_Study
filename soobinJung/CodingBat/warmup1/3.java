class Solution {
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile == bSmile) {
            return true;
        } else {
            return false;
        }
    }
}

// 내가 생각한 문제 의도
// 풀이 설명
// 다른 풀이
/*
 * public boolean monkeyTrouble(boolean aSmile, boolean bSmile) { if (aSmile &&
 * bSmile) { return true; } if (!aSmile && !bSmile) { return true; } return
 * false; // The above can be shortened to: // return ((aSmile && bSmile) ||
 * (!aSmile && !bSmile)); // Or this very short version (think about how this is
 * the same as the above) // return (aSmile == bSmile); }
 */

// 대체로 중첩이나 if else 잘 안씀 ㅠㅜ 성능에서 딸리나봄 ㅠㅜ
// 아직 내가 쓰는 풀이는 정답보다 가독성이 현저히 떨어짐.
// 풀이 생각하고 간결하게 코드 쓸 수 있는 방법은 없는지 생각 ㄱ ㄱ