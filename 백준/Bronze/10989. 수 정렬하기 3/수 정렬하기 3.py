import sys

# N 입력값 받기
N = int(sys.stdin.readline().strip())

# 계수 정렬용 리스트
count = [0] * 10001

# N만큼 정수 입력받기
for _ in range(N):
    num = int(sys.stdin.readline().strip())
    count[num] += 1

# 정렬된 결과 출력
for i in range(10001):
    if count[i] > 0:
        for _ in range(count[i]):
            print(i)
