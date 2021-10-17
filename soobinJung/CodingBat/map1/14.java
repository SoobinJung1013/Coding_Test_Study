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
