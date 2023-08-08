import sys
from itertools import permutations

n = int(input())
num = list(permutations([1,2,3,4,5,6,7,8,9], 3))

for i in range(n):
    t, s, b = map(int, input().split()) #맞추는 사람
    t = list(str(t)) #인덱스 접근을 위해
    remove_cnt = 0 

    for j in range(len(num)):
        s_cnt = b_cnt = 0
        j -= remove_cnt #삭제된 조합만큼 스킵
        
        for k in range(3): #비교하기
            if int(t[k]) in num[j]: 
                if k == num[j].index(int(t[k])): #스트라이크
                    s_cnt += 1
                else: #볼
                    b_cnt += 1
        
        if s_cnt != s or b_cnt != b: #틀린 정답
            num.remove(num[j])
            remove_cnt += 1

print(len(num))