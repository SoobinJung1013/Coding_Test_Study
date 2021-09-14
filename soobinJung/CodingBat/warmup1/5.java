class Solution {
    public boolean parrotTrouble(boolean talking, int hour) {
        // 0~ 7 && 20 ~23 ==> talking : flase ==. return true
        // talking time ==>
        if (7 <= hour && hour <= 20) { // talking time
            return false;
        } else { // not talking time
            if (talking == true) {
                return true;
            } else {
                return false;
            }
        }
    }

}

// 내가 생각한 문제 의도
// 풀이 설명

/*
 * 다른 풀이 public boolean parrotTrouble(boolean talking, int hour) { return
 * (talking && (hour < 7 || hour > 20)); // Need extra parenthesis around the ||
 * clause // since && binds more tightly than || // && is like arithmetic *, ||
 * is like arithmetic + }
 */
/*
 * not talking time -> talk ==> true 이외의 케이스는 Problem false 리턴값 true, flase
 * 구분잘하기
 */