import sys
input = sys.stdin.readline

n, k = map(int,input().split())
temp = list(map(int,input().split()))

part = sum(temp[:k]) #첫번째 경우의 합
ans = part

for i in range(0, n-k): #가능한 경우의 수
    part += temp[i+k] - temp[i] #슬라이딩 윈도우
    ans = max(ans, part)

print(ans) #최댓값 출력

#해설 : https://y-seo.tistory.com/entry/%EB%B0%B1%EC%A4%80%ED%8C%8C%EC%9D%B4%EC%8D%AC-2559%EB%B2%88-%EC%88%98%EC%97%B4