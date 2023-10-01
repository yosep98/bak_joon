import sys
input = sys.stdin.readline

push_list = []


def push(n):
    push_list.append(n)


def pop():
    if not is_empty():
        return push_list.pop()
    else:
        return -1


def size():
    return len(push_list)


def top():
    if not is_empty():
        return push_list[-1]
    else:
        return -1


def is_empty():
    return len(push_list) == 0

def empty():
    if is_empty():
        return 1
    else:
        return 0
n = int(input())
for _ in range(n):
    command = input().split()
    if command[0] == 'push':
        push(int(command[1]))
    elif command[0] == 'pop':
        print(pop())
    elif command[0] == 'size':
        print(size())
    elif command[0] == 'top':
        print(top())
    elif command[0] == 'empty':
        print(empty())
