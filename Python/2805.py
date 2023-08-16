import sys

n, m = map(int,sys.stdin.readline().split())
tree = list(map(int, sys.stdin.readline().split()))

start, end = 0, max(tree)
while start <= end: #매개변수 탐색
    mid = (start + end) // 2
    total = 0
    for i in tree: #잘라진 나무의 길이 총합 계산
        if i > mid:
            total += (i - mid)
    if total < m:
        end = mid - 1
    else:
        start = mid + 1
print(end)

#해설
#https://y-seo.tistory.com/manage/posts/