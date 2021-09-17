#백준 1259번 문제풀이
#브론즈I
#팰린드롬수

while True:
  n=input()

  if(n=='0'):
    break

  pen=n[::-1]

  if(n==pen):
    print('yes')
  else:
    print('no')