t = int(input())
for x in range(0,t):
    a,b = list(map(int,input().split()))
    count=0
    for i in range(0,32): 
        if ((( a >>  i) & 1) != (( b >>  i) & 1)):  
             count=count+1
    print(count)