#백준 5622
#bronzeII

#####내 풀이
s=input()
t=0

for i in s:
  i=ord(i)
  if(65<=i<=67): #A,B,C
    t+=3
  elif(68<=i<=70):  #D,E,F
    t+=4
  elif(71<=i<=73):  #G,H,I
    t+=5
  elif(74<=i<=76):  #J,K,L
    t+=6
  elif(77<=i<=79):  #M,N,O
    t+=7
  elif(80<=i<=83):  #P,Q,R,S
    t+=8
  elif(84<=i<=86):  #T,U,V
    t+=9
  elif(87<=i<=90):  #W,X,Y,Z
    t+=10

print(t)

#####신박한 풀이
dial = ['ABC', 'DEF', 'GHI', 'JKL', 'MNO', 'PQRS', 'TUV', 'WXYZ']
s = input()
c = 0

for letter in s:
  for d in dial:
    if letter in d:
      c += dial.index(d)+3
print(c)