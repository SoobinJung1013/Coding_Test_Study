class Solution {
    public boolean posNeg(int a, int b, boolean negative) {
        // one is + one is - ==> true

        // both are - && negative ==> true
        // + + ==> false
        int multiplication = a * b;

        if (multiplication < 0 && negative == true) {
            return false;
        }

        if (multiplication >= 0 && (a > 0 || negative == false)) {
            return false;
        }

        return true;
    }

}

/*
 * public boolean posNeg(int a, int b, boolean negative) {
 * 
 * // new // 1. -, + && negative == false // 2. -, - int multiplication = a*b;
 * 
 * if ( multiplication < 0 && negative == false) { return true; }
 * 
 * if (multiplication > 0 && a < 0 && negative == true ) { return true; }
 * 
 * return false; }
 */

// 문제가 좀 이해 안됨
// 아직 잘 모르겠는데 예시에서 true 나오는 예들만 보여줌 : 이거 참고 ㄱ ㄱ

/*
 * public boolean posNeg(int a, int b, boolean negative) { if (negative) {
 * return (a < 0 && b < 0); } else { return ((a < 0 && b > 0) || (a > 0 && b <
 * 0)); } }
 */
// 우선 경우의 수가 더 적은 negative 중심으로 분류함