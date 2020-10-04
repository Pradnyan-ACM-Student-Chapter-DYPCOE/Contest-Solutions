def reverse(num):
    numf = 0
    while num>0:
        digit = num%10
        numf = numf*10 + digit
        num = num // 10
    return numf

t = int(input())
for i in range(t):
    a,b = list(map(int,input().split()))
    arev = reverse(a)
    brev = reverse(b)
    sumf = arev + brev
    sumv = reverse(sumf)
    print(sumv)
    
    
        
    