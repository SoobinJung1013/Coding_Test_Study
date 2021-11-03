public int start1(int[] a, int[] b) {
    int cnt = 0;
    for (int i = 0; i < a.length; i++){
      if (a[i] == 1)
        cnt++;
    }
    for (int i = 0; i < b.length; i++){
      if (b[i] == 1)
        cnt++;
    }
    return cnt;
  }
