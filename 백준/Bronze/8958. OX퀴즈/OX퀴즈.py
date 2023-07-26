count = 0
score = 0
num = int(input())

for _ in range(num):
    combo = input()
    for i in combo:
        if i == 'O':
            count += 1
            score += count
        elif i == 'X':
            count = 0  # 카운트 초기화

    print(score)
    count = 0  # 점수 계산 후 카운트 초기화
    score = 0  # 점수 초기화
