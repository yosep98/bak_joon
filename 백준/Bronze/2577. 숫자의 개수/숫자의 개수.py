A= input()
B = input()
C = input()
result = int(A) * int(B) * int(C)
result_list = list(str(result))

for i in range(10):
    count = result_list.count(str(i))
    print(count)
