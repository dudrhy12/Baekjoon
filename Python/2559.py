import sys
input = sys.stdin.readline

n, k = map(int,input().split())
temp = list(map(int,input().split()))

part = sum(temp[:k]) #첫번째 경우의 합
ans = 0

for i in range(0, n-k): #가능한 경우의 수
    part += temp[i+k] - temp[i] #슬라이딩 윈도우
    ans = max(ans, part)

print(ans) #최댓값 출력