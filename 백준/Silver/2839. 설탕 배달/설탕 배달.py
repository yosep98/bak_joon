num = int(input())
count = 0

while num >= 0:
    if num % 5 == 0:
        count += num // 5
        print(count)
        break
    else:
        num -= 3
        count += 1
else:
    print(-1)
