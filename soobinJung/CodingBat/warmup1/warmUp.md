## 🏷 sleepIn

```java
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
```

## 🏷 sumDouble

```java
class Solution {
    public int sumDouble(int a, int b) {
        if (a == b) {
            return (a + b) * 2;
        } else {
            return a + b;
        }
    }

}

// 내가 생각한 문제 의도
// 풀이 설명
// 다른 풀이
/*
 * public int sumDouble(int a, int b) { // Store the sum in a local variable int
 * sum = a + b;
 *
 * // Double it if a and b are the same if (a == b) { sum = sum * 2; }
 *
 * return sum; }
 */
// 풀이들 보면 if-else 로 안꼬아둠
// 논리도 좋은데, 직관적이게 표현을 함.
// 풀이랑 비교하면 내가 쓴 답은 비교적 가독성이 떨어짐
// 중첩이랑 if-else 줄이고 직관적으로 생각하고 작성 ㄱ ㄱ
```

## 🏷 monkeyTrouble

```java
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
```

## 🏷 diff21

```java
class Solution {
    public int diff21(int n) {
        int diff;
        diff = 21 - n;
        if (diff >= 0) {
            return diff;
        } else {
            return (-diff) * 2;
        }
    }
}

// 내가 생각한 문제 의도
// 풀이 설명
// 다른 풀이
```

## 🏷 parrotTrouble

```java
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
```

## 🏷 makes10

```java
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
```

## 🏷 nearHundred

```java
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
```

## 🏷 posNeg

```java
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
```

## 🏷 notString

```java
class Solution {
    public String notString(String str) {
        // not + str
        String[] ext = str.split(" ");

        if (ext[0].equals("not")) {
            return str;
        }

        return "not " + str;
    }

}

/*
 * public String notString(String str) { if (str.length() >= 3 &&
 * str.substring(0, 3).equals("not")) { return str; }
 *
 * return "not " + str; }
 */

// str.substring(0, 3).equals("not")

```

## 🏷 missingChar

```java
public String missingChar(String str, int n) {
        // index of array
        // subString(a, b) = a부터 b전까지의 위치의 문자열을 가져온다.
        // substring(a, b)

        return str.substring(0, n) + str.substring(n + 1, str.length());
}


// subSting으로 했는데 안됨
// substring으로 하니까 됨
// 왜그러는지 모르겠음 ㅅㅂ
// substing(0, n)으로할 때 0이상 n 전까지 가져오는 거임

// java string 메소드 정리한거 읽어보기
```

## 🏷 backAround

```java
public String backAround(String str) {
    int len = str.length();
    char lastChar = str.charAt(len-1);
    return lastChar + str + lastChar;
  }


//   public String backAround(String str) {
//     // Get the last char
//     String last = str.substring(str.length() - 1);
//     return last + str + last;
//   }
```

## 🏷 or35

```java
public boolean or35(int n) {

    return n % 3 == 0 || n % 5 == 0;
  }


//   public boolean or35(int n) {
//     return (n % 3 == 0) || (n % 5 == 0);
//   }
```

## 🏷 front22

```java
public String front22(String str) {

    String twoChar;

    if ( str.length() >= 2 ) {
        twoChar = str.substring(0,2);
        return twoChar + str + twoChar;
    } else {
      return str + str + str;
    }

  }


// Solution:
//   public String front22(String str) {
//     // First figure the number of chars to take
//     int take = 2;
//     if (take > str.length()) {
//       take = str.length();
//     }

//     String front = str.substring(0, take);
//     return front + str + front;
//   }
```

## 🏷 startHi

```java
public boolean startHi(String str) {
    if ( str.length() < 2 ) {
      return false;
    }

    return str.substring(0,2).equals("hi");
  }


//나쁘지 않은거같음. 예외처리 해준거 잘했음.
```

## 🏷 icyHot

```java
public boolean icyHot(int temp1, int temp2) {

    int checkMinus = temp1 * temp2;

    if (checkMinus >= 0) {
      return false;
    }

    if ( temp1 > 100 || temp2 > 100 ){
      return true;
    }

    return false;
  }


// 내가 너무 어렵게 생각한거같음. 메모리랑 시간 못보낭 ..? ㅠㅜㅠㅜㅠ

// Solution:
// public boolean icyHot(int temp1, int temp2) {
//   if ((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0)) {
//     return true;
//   } else {
//     return false;
//   }
//   // Could be written as: return ((temp1 < 0 && ...));
// }
```

## 🏷 frontBack

```java
public String frontBack(String str) {

    int len = str.length();

    if ( len < 2 ) {
      return str;
    }

    String front = str.substring(0,1);
    String back = str.substring(len-1, len);

    return back + str.substring(1, len - 1) + front;
  }



// Solution:
// public String frontBack(String str) {
//   if (str.length() <= 1) return str;

//   String mid = str.substring(1, str.length()-1);

//   // last + mid + first
//   return str.charAt(str.length()-1) + mid + str.charAt(0);
// }



// 앞뒤만 바꾸면됨. 문자열 다 바꿈
// StringBuffer sb = new StringBuffer(str);
// String reversedStr = sb.reverse().toString();
// return reversedStr; // edcba

```

## 🏷 front3

```java
public String front3(String str) {

    if (str.length() < 3) return str + str +str ;

    String first3 = str.substring(0,3);
    return first3 + first3 + first3;
}


//repeat( ) 안됨.
// public String front3(String str) {
//     int len = str.length();

//     if (len < 3) return str.repeat(3);

//     return str.substring(0,3).repeat(3)
//   }

```
