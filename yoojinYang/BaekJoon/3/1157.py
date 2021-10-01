#백준 1157
#bronzeI
#중복을 제거하기 위해서 set 함수를 사용한다
#대문자 upper, 소문자 lower
#max의 개수 찾기 : count
#max의 index 찾기 : index

w=input().upper()
w_list=list(set(w))
c_list=[]

#word count
for i in w_list:
  count=w.count(i)
  c_list.append(count)

#find max
if(c_list.count(max(c_list))>=2):
  print('?')
else:
  print(w_list[c_list.index(max(c_list))])
