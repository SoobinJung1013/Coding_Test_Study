public String left2(String str) {
    if ( str.length() < 3 ) return str;
    return str.substring(2, str.length()) + str.substring(0,2);
  }
