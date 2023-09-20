import sys
input = sys.stdin.readline

n, d, k, c = map(int,input().split())
belt= [int(input()) for __ in range(n)]
ans = 0

for i in range(n):
    if ( i + k ) < n:
        temp = len(set(belt[i:i+k] + [c]))
    else:
        temp = len(set(belt[i:n] + belt[:(i+k)%n] + [c]))
    ans = max(ans, temp)

print(ans)