#EPPER 7번
#아직도 잘 모르겠음

def solution(r,c,zr,zc,words):
    answer=[]

    for i in range(r):
        temp=''

        for j in range(c):

            for k in range(zc):
                temp+=words[i][j]
            
        for m in range(zr):
            anser.append(temp)

    return answer