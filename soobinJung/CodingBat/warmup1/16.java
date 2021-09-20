public String frontBack(String str) {
  
    int len = str.length();

    if ( len < 2 ) {
      return str;
    }
    
    String front = str.substring(0,1);
    String back = str.substring(len-1, len);
    
    return back + str.substring(1, len - 1) + front;
  }
  


// Solution:
// public String frontBack(String str) {
//   if (str.length() <= 1) return str;
  
//   String mid = str.substring(1, str.length()-1);
  
//   // last + mid + first
//   return str.charAt(str.length()-1) + mid + str.charAt(0);
// }



// 앞뒤만 바꾸면됨. 문자열 다 바꿈
// StringBuffer sb = new StringBuffer(str); 
// String reversedStr = sb.reverse().toString();
// return reversedStr; // edcba
