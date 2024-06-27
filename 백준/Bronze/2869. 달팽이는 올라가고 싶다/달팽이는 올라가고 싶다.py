import math

# 입력 받기
A, B, C = map(int, input().split())

# 조건 체크
if A <= B:
    print("불가능")
else:
    # 총 필요한 일수 계산
    days = math.ceil((C - A) / (A - B)) + 1
    print(days)
