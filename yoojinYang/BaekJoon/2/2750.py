#백준 2750번 문제풀이
#브론즈I
#정렬 -> sorted 함수 사용

n=int(input())
arr=[]
for i in range(n):
  arr.append(int(input()))
s=sorted(arr)

for i in range(n):
  print(s[i])