public int[] frontPiece(int[] nums) {
    int[] arr = new int[2];
    if (nums.length <= 1){
      return nums;
    }
    else{
      for(int i = 0 ; i < 2 ; i++) 
          arr[i] = nums[i]; 
    }
    return arr;
  
  }
