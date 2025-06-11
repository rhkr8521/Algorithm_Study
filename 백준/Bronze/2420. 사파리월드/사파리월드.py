a,b = map(int,input().split())

if a>0 and b<0:
    print(a+abs(b))
elif a<0 and b>0:
    print(abs(a)+b)
elif a > b:
    print(a-b)
elif a < b:
    print(b-a)