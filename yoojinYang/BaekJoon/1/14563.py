#백준 14563번 문제풀이
#브론즈I
#완전수 찾기
#약수 구하기

n=int(input())

#약수 구해서 더하기
def yacsum(num):
  ysum=0
  for i in range(1,num):
    if(num%i==0):
      ysum+=i
  return ysum

alist=list(map(int,input().split()))
for i in alist:
  if(yacsum(i)<i):
    print('Deficient')
  elif (yacsum(i)==i):
    print('Perfect')
  else:
    print('Abundant')