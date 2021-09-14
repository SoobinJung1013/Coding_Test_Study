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