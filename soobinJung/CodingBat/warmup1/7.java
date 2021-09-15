class Solution {
    public boolean nearHundred(int n) {
        int near100 = Math.abs(100 - n);
        int near200 = Math.abs(200 - n);
        // near value have to be 0~10
        if (near100 <= 10 || near200 <= 10) {
            return true;
        }

        return false;
    }

}
/*
 * public boolean nearHundred(int n) { return ((Math.abs(100 - n) <= 10) ||
 * (Math.abs(200 - n) <= 10)); }
 */

// ... if 부분이 간단하면 return 에서 바로 넘겨주장 ~
// Math.abs(200 - n)