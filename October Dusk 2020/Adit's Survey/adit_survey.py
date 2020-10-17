n = int(input())
house = map(int,input().split())
for i in house:
    if i*8 <250:
        print(250,end =" ")
    else:
        print(i*8,end =" ")