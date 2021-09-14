class Solution {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (vacation == false) {
            if (weekday == false) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }
}

// 내가 생각한 문제 의도
// 풀이 설명
// 다른 풀이