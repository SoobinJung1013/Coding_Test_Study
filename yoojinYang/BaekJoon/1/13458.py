#백준 13458번 문제풀이
#브론즈II
#수학 계산
#학생수<총감독일때 부감독이 0인 경우를 생각 못해서 오래 고민함
#올림은 ceil, 내림은 floor, 반올림은 round

import math
csum=0
remain=0

#입력
n=int(input())
a = list(map(int,input().split()))
b,c = map(int,input().split())

#계산
for i in a:
  remain = i-b
  if remain>0:
    csum+=math.ceil(remain/c)
  else:
    csum+=0

print(n+csum)