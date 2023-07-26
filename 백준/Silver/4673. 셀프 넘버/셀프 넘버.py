a=[]
b=[]
for i in range(10001):
    a.append(i)
    generate= i+sum(map(int, str(i)))
    b.append(generate)
c=list(set(a)-set(b))
c.sort()
for j in c:
    print(j)

