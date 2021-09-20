public String extraEnd(String str) {
    int len = str.length();
    String last2 = str.substring(len-2,len);
    return last2 + last2 + last2;
  }
