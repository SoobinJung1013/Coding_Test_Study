# 프로그래머스 코딩테스트 연습 > 연습문제
# level 1
# 가운데 글자 가져오기

# 내 풀이
def solution(s):
    if(len(s)%2!=0):
        answer = s[len(s)//2]
    else:
        answer = s[len(s)//2-1]+s[len(s)//2]
    return answer


# 신박한 풀이
def solution(s):
    return s[(len(s)-1)//2:len(s)//2+1]