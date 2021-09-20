public String front3(String str) {
  
    if (str.length() < 3) return str + str +str ;
    
    String first3 = str.substring(0,3);
    return first3 + first3 + first3;
}

  
//repeat( ) 안됨. 
// public String front3(String str) {
//     int len = str.length();
    
//     if (len < 3) return str.repeat(3);
    
//     return str.substring(0,3).repeat(3)
//   }
