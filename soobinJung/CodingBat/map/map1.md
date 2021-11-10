## Java Map API

```java
// Make a new empty map
Map<String, String> map = new HashMap<String, String>();
map.get(key) // retrieves the stored value for a key, or null if that key is not present in the map.

map.put(key, value) // stores a new key/value pair in the map. Overwrites any existing value for that key.

map.containsKey(key) // returns true if the key is in the map, false otherwise.

map.remove(key) // removes the key/value pair for this key if present. Does nothing if the key is not present.
```

## mapBully

```java
public Map<String, String> mapBully(Map<String, String> map) {
    String valueA;
    if (map.containsKey("a")) {
      valueA = map.get("a");
      map.put("b", valueA);
      map.put("a", "");
      return map;
    }
    else {
      return map;
    }
  }

//   Solution:
// public Map<String, String> mapBully(Map<String, String> map) {
//   if (map.containsKey("a")) {
//     map.put("b", map.get("a"));
//     map.put("a", "");
//   }
//   return map;
// }s
```

## mapShare

```java
public Map<String, String> mapShare(Map<String, String> map) {
    map.remove("c");
    if (map.containsKey("a")) {
      map.put("b", map.get("a"));
      return map;
    }
    return map;
   }
```

## mapAB

```java
public Map<String, String> mapAB(Map<String, String> map) {
    if ( map.containsKey("a") && map.containsKey("b")) {
      map.put("ab", (map.get("a") + map.get("b")));
      return map;
    }
    return map;
  }

```

## topping1

```java
public Map<String, String> topping1(Map<String, String> map) {
    map.put("bread", "butter");
    if (map.containsKey("ice cream")) {
      map.put("ice cream", "cherry");
      return map;
    }
    return map;
  }

```

## topping2

```java
public Map<String, String> topping2(Map<String, String> map) {
    if (map.containsKey("spinach")) {
      map.put("spinach", "nuts");
    }
    if (map.containsKey("ice cream")) {
      map.put("yogurt", map.get("ice cream"));
      return map;
    }
    return map;
  }
```

## topping3

```java
public Map<String, String> topping3(Map<String, String> map) {
    if (map.containsKey("salad")) {
      map.put("spinach", map.get("salad"));
    }
    if (map.containsKey("potato")) {
      map.put("fries", map.get("potato"));
      return map;
    }
    return map;
  }
```

## mapAB2

```java
public Map<String, String> mapAB2(Map<String, String> map) {
    // map.get("a") == map.get("b")
    if (map.containsKey("a") && map.containsKey("b")) {
      if ( map.get("a").equals(map.get("b")) ) {
        map.remove("a");
        map.remove("b");
      }
      return map;
    }
    return map;
}


  // equals() 대신 == 쓰면 틀림

```

## mapAB3

```java
public Map<String, String> mapAB3(Map<String, String> map) {
    if (map.containsKey("a") && !map.containsKey("b")) {
      map.put("b", map.get("a"));
      return map;
    }
    if (map.containsKey("b") && !map.containsKey("a")) {
      map.put("a", map.get("b"));
      return map;
    }
    return map;
  }
```

## mapAB4

```java
public Map<String, String> mapAB4(Map<String, String> map) {
    if (map.containsKey("a") && map.containsKey("b")){
      if (map.get("a").length() > map.get("b").length()) {
        map.put("c", map.get("a"));
      }
      else if (  map.get("a").length() < map.get("b").length()) {
        map.put("c", map.get("b"));
      }
      else {
        map.put("a", "");
        map.put("b", "");
      }
    }
    return map;
}

```

## word0

```java
public Map<String, Integer> word0(String[] strings) {
    Map<String, Integer> map = new HashMap();
    for (String s : strings) {
      map.put(s, 0);
    }
    return map;
}

```

## wordLend

```java
public Map<String, Integer> wordLen(String[] strings) {
    Map<String, Integer> map = new HashMap();
    for (String s : strings) {
      map.put(s, s.length());
    }
    return map;
}
```

## pairs

```java
public Map<String, String> pairs(String[] strings) {
    Map<String, String> map = new HashMap();
    for ( String s : strings ) {
      map.put(s.substring(0,1), s.substring(s.length() - 1));
    }
    return map;
}

```

## wordCount

```java
public Map<String, Integer> wordCount(String[] strings) {
    Map<String, Integer> map = new HashMap();
    for (String s: strings) {
      int count = 0;
      for (String countString: strings) {
        if (s == countString) {
          count++;
        }
      }
      map.put(s, count);
    }
    return map;
  }
```

## firstChar

```java
public Map<String, String> firstChar(String[] strings) {
    Map<String, String> map = new HashMap();
    for (String s : strings) {
      map.put(s.substring(0,1), "");
    }
    for (String s: strings) {
      map.put(s.substring(0,1), map.get(s.substring(0,1)) + s);
    }
    return map;
  }
```

## wordAppend

```java
public String wordAppend(String[] strings) {
    Map<String, Integer> map = new HashMap();
    String answer = "";
    for (String s : strings) {
      map.put(s, 0);
    }
    for (String s : strings) {
      map.put(s, map.get(s) + 1);
      if ( map.get(s) == 2 ) {
        answer = answer + s;
        map.put(s, 0);
      }
    }
    return answer;
  }

// String answer = "";
// Map<String, Integer> map = new HashMap();
// for (String s : strings) {
// int count = 0;
// for (String countString: strings) {
// if ( s == countString ) {
// count++;
// }
// }
// map.put(s, count);
// }
// for (String k: map.keySet()) {
// while(map.get(k) >= 2) {
// answer = answer + k;
// map.put(k, map.get(k)-2);
// }
// }
// return answer;
```

## wordMultiple

```java
public Map<String, Boolean> wordMultiple(String[] strings) {
    Map<String, Boolean> map = new HashMap();
    for (String s : strings) {
      if (map.containsKey(s)) {
        map.put(s, true);
      }
      else {
        map.put(s, false);
      }
    }
    return map;
  }
```
