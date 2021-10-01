#epper15-5
#문자열 압축
#ord, chr 함수

s=input()
a=''
count=0

#앞자리 확인
if(s[0]=='1'):
  a='1'

#개수 세기 
for i in range(len(s)-1):
  if(s[i]==s[i+1]):
    count+=1
  else:
    a=a+chr(count+65)
    count=0
a=a+chr(count+65)

print(a)
