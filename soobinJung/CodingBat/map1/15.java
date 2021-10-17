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