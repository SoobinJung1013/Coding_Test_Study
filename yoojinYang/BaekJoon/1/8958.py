#백준 8958번 문제풀이
#브론즈II
#OX 세기 - 단순 계산

n=int(input())

def countfunc(s):
  count=0
  result=0

  for i in s:
    if(i=='O'):
      count+=1
      result+=count
    else:
      count=0
  return result

for i in range(n):
  s=input()
  print(countfunc(s))