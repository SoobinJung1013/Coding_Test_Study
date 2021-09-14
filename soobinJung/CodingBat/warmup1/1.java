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
/*
 * public boolean sleepIn(boolean weekday, boolean vacation) { if (!weekday ||
 * vacation) { return true; }
 * 
 * return false;
 * 
 * // Solution notes: better to write "vacation" than "vacation == true" //
 * though they mean exactly the same thing. // Likewise "!weekday" is better
 * than "weekday == false". // This all can be shortened to: return (!weekday ||
 * vacation); // Here we just put the return-false last, or could use an
 * if/else. }
 */
// 조건문을 한줄로 가돗성있게 써서 중접 조건문 안써도 되게 풀이함 . 아마 빅오퓨ㅕ기법에서 유리할 듯.

// 보통 결과값이 (true, false) 나올 수 있는 경우의 수가 적은걸 모아서 짧게 표현하고 나머지는 ... 이런식으로 표현해줌