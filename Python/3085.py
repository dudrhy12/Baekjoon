import sys
input = sys.stdin.readline

def check(board): # 사탕 최대 개수 체크
    count_max = 1
    for i in range(size):
        temp_max = 1
        for j in range(1, size): # 열 체크
            if board[i][j] == board[i][j-1]: # 연속일 때
                temp_max += 1
            else:
                temp_max = 1
            count_max = max(count_max, temp_max)
        temp_max = 1
        for j in range(1, size): # 행 체크
            if board[j][i] == board[j-1][i]: # 연속일 때
                temp_max += 1
            else:
                temp_max = 1
            count_max = max(count_max, temp_max)
    return count_max
3
size = int(input())
board = [list(input()) for i in range(size)] # 2차원 배열 
count = 0

for i in range(size):
    for j in range(size): # 완전 탐색 (brute force)
        if j+1 < size: # 열 체크
            board[i][j], board[i][j+1] = board[i][j+1], board[i][j] # 인접한 두 문자 바꾸기
            temp = check(board)
            count = max(count, temp) # 최대 개수 체크
            board[i][j], board[i][j+1] = board[i][j+1], board[i][j] # 돌려놓기 
        if i+1 < size: # 행 체크
            board[i][j], board[i+1][j] = board[i+1][j], board[i][j] # 인접한 두 문자 바꾸기
            temp = check(board)
            count = max(count, temp) # 최대 개수 체크
            board[i][j], board[i+1][j] = board[i+1][j], board[i][j] # 돌려놓기
print(count)

