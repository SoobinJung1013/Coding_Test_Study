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
  // 왜 그런지 모르겠슴 시발