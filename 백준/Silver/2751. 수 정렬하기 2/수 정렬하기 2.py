import sys
input = sys.stdin.readline

n= int(input())

my_list=[]

for _ in range(n):
    u=int(input())
    my_list.append(u)

my_list.sort()
for u in my_list:
    print(u)