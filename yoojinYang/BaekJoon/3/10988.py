#백준 10988번
#bronzeI
#백준 1259와 동일

w=input()

pen=w[::-1]

if(w==pen):
  print(1)
else:
  print(0)