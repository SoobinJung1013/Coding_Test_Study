class Solution {
    public boolean makes10(int a, int b) {
        int sum;
        sum = a + b;

        if (a == 10 || b == 10 || sum == 10) {
            return true;
        } else {
            return false;
        }
    }

}

/*
 * public boolean makes10(int a, int b) { return (a == 10 || b == 10 || a+b ==
 * 10); }
 */

// 5번 문제 6번 문제 if 안쓰고 return 부분에서 바로 true, false 반환해줌.