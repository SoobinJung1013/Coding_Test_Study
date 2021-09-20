public String backAround(String str) {
    int len = str.length();
    char lastChar = str.charAt(len-1);
    return lastChar + str + lastChar;
  }


//   public String backAround(String str) {
//     // Get the last char
//     String last = str.substring(str.length() - 1);
//     return last + str + last;
//   }