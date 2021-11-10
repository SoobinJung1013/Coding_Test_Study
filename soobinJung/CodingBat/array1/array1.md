- [coding bat : array](https://codingbat.com/java/Array-1)

## 🏷 firstLast6

```java
public boolean firstLast6(int[] nums) {
    if (nums[(nums.length)-1] == 6 || nums[0] == 6)
      return true;
    else
      return false;
  }
```

## 🏷 sameFirtstLast

```java
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
```

## 🏷 makePI

```java
public int[] makePi() {
    int[] pi = {3,1,4};
    return pi;
}
```

## 🏷 commonEnd

```java
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

```

## 🏷 start1

```java
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

```

## 🏷 frontPiece

```java
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

```

## 🏷 sum3

```java
public int sum3(int[] nums) {
    int sum = 0;
    for (Integer i : nums) {
      sum += i;
    }
    return sum;
  }

```
