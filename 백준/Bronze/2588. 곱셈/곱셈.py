num1 = int(input())
num2 = input()
result = {}
sum_val = 0

for i in range(len(num2)):
    result[i] = num1 * int(num2[2-i])
    sum_val += result[i] * (10 ** (i))

for i in range(3):
    print(result[i])

print(sum_val)
