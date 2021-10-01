#epper15-3
#재고 없는 날
#난이도 하

count=0
n, m=map(int,input().split())

while(n!=0):
  count+=1
  n-=1
  if (count%m==0):
    n+=1

print(count)