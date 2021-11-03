public boolean commonEnd(int[] a, int[] b) {
    if (a.length < 1 || b.length < 1){
      return false;
    }
    if (a[a.length - 1] == b[b.length - 1])
      return true;
    if (a[0] == b[0] )
      return true;
    return false;
  }
