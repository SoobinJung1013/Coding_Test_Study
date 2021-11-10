- [coding bat : map2](https://codingbat.com/java/String-1)

## 🏷 helloName

```java
public String helloName(String name) {
    return "Hello " + name + "!";
}
```

## 🏷 makeAbba

```java
public String makeAbba(String a, String b) {
    return a + b + b + a;
  }
```

## 🏷 makeTag

```java
public String makeTags(String tag, String word) {
    return "<" + tag +">" + word + "</" + tag +">";
}
```

## 🏷 makeOutWord

```java
public String makeOutWord(String out, String word) {
    return out.substring(0,2) + word + out.substring(2,4);
  }
```

## 🏷 extraEnd

```java
public String extraEnd(String str) {
    int len = str.length();
    String last2 = str.substring(len-2,len);
    return last2 + last2 + last2;
  }

```

## 🏷 firstTwo

```java
public String firstTwo(String str) {
    if (str.length() < 2) {
      return str;
    }
    return str.substring(0,2);
  }
```

## 🏷 firstHalf

```java
public String firstHalf(String str) {
    int halfLen = str.length()/2;
    return str.substring(0, halfLen);
  }
```

## 🏷 withoutEnd

```java
public String withoutEnd(String str) {
    int len = str.length();
    return str.substring(1, len -1);
  }
```

## 🏷 comboString

```java
public String comboString(String a, String b) {
    int lenA = a.length();
    int lenB = b.length();

    if ( lenA < lenB ) {
      return a + b + a;
    } else {
      return b + a + b;
    }
  }
```

## 🏷 nonStart

```java
public String nonStart(String a, String b) {
    return a.substring(1, a.length()) + b.substring(1, b.length());
  }
```

## 🏷 left2

```java
public String left2(String str) {
    if ( str.length() < 3 ) return str;
    return str.substring(2, str.length()) + str.substring(0,2);
  }
```
