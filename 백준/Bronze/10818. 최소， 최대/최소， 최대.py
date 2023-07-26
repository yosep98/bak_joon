N = int(input())
nums = []

input_nums = input().split()
for i in range(N):
    num = int(input_nums[i])
    nums.append(num)

minimum = min(nums)
maximum = max(nums)

print(minimum, maximum)
