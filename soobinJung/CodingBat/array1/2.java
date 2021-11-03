public boolean sameFirstLast(int[] nums) {
    // if (nums.length >= 1){
    //   if(nums[(nums.length)-1] == nums[0])
    //     return true;
    //   else
    //     return false;
    // }
    // else
    //     return false;
    if ( nums.length < 1 || nums[(nums.length)-1] != nums[0])
      return false;
    else 
      return true;
  }