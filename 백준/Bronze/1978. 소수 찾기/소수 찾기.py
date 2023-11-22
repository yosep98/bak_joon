def is_prime(num):
    if num < 2:
        return False
    for i in range(2, int(num ** 0.5) + 1):
        if num % i == 0:
            return False
    return True

# N값 입력 받기
N = int(input())

# N개의 숫자를 입력받아 리스트에 저장
numbers = list(map(int, input().split()))

# 소수 개수 카운트
prime_count = 0
for num in numbers:
    if is_prime(num):
        prime_count += 1

# 결과 출력
print(prime_count)
