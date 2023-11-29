#블랙잭

#n으로 숫자의 개수 정의 obj로 목표 숫자값 정의
n,obj=map(int,input().split())
#n번 만큼의 숫자값 split 해서 리스트에 삽입
l=list(map(int,input().split()))
#obj에 넘지 않으면서 최대한 가까운 3장의 합을 찾아야함
s=0
for i in range(0,n-2):
    for j in range(i+1,n-1):
        for k in range(j+1,n):
            r=l[i]+l[j]+l[k]
            if obj>=r and r>s:
                s=r

print(s)