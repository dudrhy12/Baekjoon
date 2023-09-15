import sys

n, k = map(int,sys.stdin.readline().split())
a = list(map(int,input().split()))

left, right, ans = 0, 0, 0
cnt = [0] * (max(a) + 1)

while right < n:
    if cnt[a[right]] < k:
        cnt[a[right]] += 1
        right += 1
    else:
        cnt[a[left]] -= 1
        left += 1
    ans = max(ans, right-left)

print(ans)

