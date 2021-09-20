class Solution {
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        // 1. vacation : true -> sleepIn : true
        // 2. weekday : false -> sleepIn : true
        // 3. 예외처리
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




