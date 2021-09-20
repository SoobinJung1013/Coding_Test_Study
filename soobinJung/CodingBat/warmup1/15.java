public boolean icyHot(int temp1, int temp2) {

    int checkMinus = temp1 * temp2;
    
    if (checkMinus >= 0) {
      return false;
    }
    
    if ( temp1 > 100 || temp2 > 100 ){
      return true;
    }
    
    return false;
  }


// 내가 너무 어렵게 생각한거같음. 메모리랑 시간 못보낭 ..? ㅠㅜㅠㅜㅠ

// Solution:
// public boolean icyHot(int temp1, int temp2) {
//   if ((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0)) {
//     return true;
//   } else {
//     return false;
//   }
//   // Could be written as: return ((temp1 < 0 && ...));
// }