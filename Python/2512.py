import sys

n = int(sys.stdin.readline())
organ = list(map(int, sys.stdin.readline().split()))
m = int(sys.stdin.readline())

start, end = 0, max(organ)
while start <= end:
    mid = (start + end) // 2
    total = 0
    for i in organ:
        total += min(mid, i)
    if total > m:
        end = mid - 1
    else:
        start = mid + 1
print(end)

