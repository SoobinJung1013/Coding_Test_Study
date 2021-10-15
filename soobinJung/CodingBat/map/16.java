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
