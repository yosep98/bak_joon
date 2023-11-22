while True:
    a, b, c = map(int, input().split())

    # a, b, c가 0 0 0일 경우 종료
    if a == 0 and b == 0 and c == 0:
        break

    # 크기가 낮은 순으로 배열 (생략)

    # 각 변의 제곱값 계산
    a_sq = a ** 2
    b_sq = b ** 2
    c_sq = c ** 2

    # 삼각형이 직각인지 확인
    if a_sq + b_sq == c_sq or a_sq + c_sq == b_sq or b_sq + c_sq == a_sq:
        print('right')
    else:
        print('wrong')
