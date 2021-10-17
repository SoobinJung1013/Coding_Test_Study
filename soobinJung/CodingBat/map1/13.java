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
