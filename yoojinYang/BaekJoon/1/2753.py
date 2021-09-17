#백준 2753번 문제풀이
#브론즈IV
#윤년

n=int(input())

if (n%400==0):
  print(1)
elif (n%4==0 and n%100!=0):
  print(1)
else:
  print(0)