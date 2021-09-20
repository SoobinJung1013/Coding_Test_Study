public String front22(String str) {
  
    String twoChar;
        
    if ( str.length() >= 2 ) {
        twoChar = str.substring(0,2);
        return twoChar + str + twoChar;
    } else {
      return str + str + str;
    }
  
  }
  

// Solution:
//   public String front22(String str) {
//     // First figure the number of chars to take
//     int take = 2;
//     if (take > str.length()) {
//       take = str.length();
//     }
    
//     String front = str.substring(0, take);
//     return front + str + front;
//   }