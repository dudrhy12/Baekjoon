import sys

n, m = map(int, sys.stdin.readline().split())

system = {}
for i in range(n): #딕셔너리로 전투력 칭호와 상한값 저장
    name, standard = sys.stdin.readline().split()
    system[i] = int(standard), name

def binary_search(array, target, start, end): #이진탐색
    res = 0
    while start <= end:
        mid = (start + end) // 2 
        if array[mid][0] >= target: #범위에 맞는 경우
            end = mid - 1
            res = mid
        else: #범위를 낮추는 경우
            start = mid + 1
    return array[res][1]

for j in range(m): #전투력 판단
    target = int(sys.stdin.readline())
    result = binary_search(system, target, 0, n-1)
    print(result)