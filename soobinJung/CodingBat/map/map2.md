## 🏷 mapBully

````java
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
// }```
````

## 🏷 mapShare

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

## 🏷 makeAB

```java
public Map<String, String> mapAB(Map<String, String> map) {
    if ( map.containsKey("a") && map.containsKey("b")) {
      map.put("ab", (map.get("a") + map.get("b")));
      return map;
    }
    return map;
}
```

## 🏷 topping1

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

## 🏷 topping 2

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

## 🏷 topping3

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

## 🏷 mapAB2

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

## 🏷 mapAB3

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

## 🏷 mapAB4

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
