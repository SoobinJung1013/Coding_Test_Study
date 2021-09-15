class Solution {
    public String notString(String str) {
        // not + str 
        String[] ext = str.split(" ");
        
        if ( ext[0].equals("not") ) {
          return str;
        }
        
        return "not " + str;
      }
      
}