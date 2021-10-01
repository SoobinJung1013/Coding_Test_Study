#epper15-4
#epper12-7
#100 만들기
#난이도 하
#마지막 list 출력 아이디어가 필요함!!!
#remove, del

a=list(map(int,input().split()))

total=0
for i in a:
  total+=i

#100찾기
for i in range(len(a)):
  for j in range(i+1,len(a)):
    if(total-a[i]-a[j]==100):
      a[i]=a[j]=0
      break

a_new=[]
#배열 출력하기
for i in a:
  if (i!=0):
    a_new.append(i)
print(a_new)