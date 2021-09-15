class Solution {
    public String missingChar(String str, int n) {
        // index of array
        // subString(a, b) = a부터 b전까지의 위치의 문자열을 가져온다.
        // substring(a, b)

        return str.substring(0, n) + str.substring(n + 1, str.length());
    }

}

// subSting으로 했는데 안됨
// substring으로 하니까 됨
// 왜그러는지 모르겠음 ㅅㅂ
// substing(0, n)으로할 때 0이상 n 전까지 가져오는 거임

// java string 메소드 정리한거 읽어보기