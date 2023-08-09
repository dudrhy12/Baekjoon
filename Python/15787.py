#사람이 있으면 1, 없으면 0

n, m = map(int,input().split( ))
train = [0] * n

for j in range(m): #명령 받기
    menu = list(map(int,input().split()))
    i = menu[1] - 1

    if menu[0] == 1: #승차
        x = menu[2] - 1
        cnt = int(bin(2**x), 2 )
        train[i] = int(bin(train[i] | cnt), 2)
    elif menu[0] == 2: #하차
        x = menu[2] - 1
        cnt = int(bin(2**20-1-2**x), 2 )
        train[i] = int(bin(train[i] & cnt), 2)
    elif menu[0] == 3: #한 칸씩 뒤로
        train[i] = int(bin(train[i]),2) << 1
        if train[i] > 2**19:
            train[i] = int(bin(train[i] & 0b011111111111111111111), 2)
    elif menu[0] == 4: #한 칸씩 앞으로
        train[i] = int(bin(train[i]),2) >> 1

train = set(train) #중복 제거
print(len(train))




