public boolean startHi(String str) {
    if ( str.length() < 2 ) {
      return false;
    }
    
    return str.substring(0,2).equals("hi");
  }


//나쁘지 않은거같음. 예외처리 해준거 잘했음. 