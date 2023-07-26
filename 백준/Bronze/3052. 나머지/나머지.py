nums = []
sum_nums = 0
nums2=[]
for _ in range(10):
    num = int(input())
    nums.append(num)

for i in nums:
    div_nums = i % 42
    nums2.append(div_nums)
final=set(nums2)
count=len(final)
print(len(final))

