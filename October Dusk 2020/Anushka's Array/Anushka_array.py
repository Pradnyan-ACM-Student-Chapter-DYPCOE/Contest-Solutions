t = int(input())
for x in range(0,t):
    n = int(input())
    lis = input().split()
    c=0
    for i in range(0,len(lis)):
        if lis[i]=='X':
            c=c+1
            lis[i]=-1
        else:
            lis[i]=1
    max_sum=-1
    curr_sum=0
    for x in lis:
        curr_sum+=x
        if max_sum<curr_sum:
            max_sum=curr_sum
        if curr_sum<0:
            curr_sum = 0
    print(max_sum+c)