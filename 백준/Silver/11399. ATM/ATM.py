N = int(input())
my_list = []
num_str = input().split()
for numbers in num_str:
    my_list.append(int(numbers))

cnt = 0

my_list = sorted(my_list)

for i in range(N):
    partial_sum = 0
    for j in range(i + 1):
        partial_sum += my_list[j]
    cnt += partial_sum
print(cnt)
