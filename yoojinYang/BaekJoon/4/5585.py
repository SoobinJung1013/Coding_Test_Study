#백준 5585
#bronzeII
#그리디 완전 기초

#####내 풀이
#거스름돈 금액
n=1000-int(input())
count=0

#잔돈 개수
count+=n//500
count+=n%500//100
count+=n%100//50
count+=n%50//10
count+=n%10//5
count+=n%5//1
print(count)

#####신박한 풀이
n=1000-int(input())
c=0

a = [500,100,50,10,5,1]

for i in a:
  c+=n//i
  n%=i

print(c)