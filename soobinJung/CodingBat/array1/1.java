public boolean firstLast6(int[] nums) {
    if (nums[(nums.length)-1] == 6 || nums[0] == 6)
      return true;
    else
      return false;
  }
