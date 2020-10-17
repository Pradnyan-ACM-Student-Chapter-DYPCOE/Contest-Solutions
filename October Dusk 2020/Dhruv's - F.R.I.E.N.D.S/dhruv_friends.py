n=3
a=0
s=0
r=0
for x in range(0,3):
    word = input()
    lis = list(word)
    if lis[1]=='<':
        if lis[0]=='A':
            a = a-1
        if lis[0]=='S':
            s=s-1
        if lis[0]=='R':
            r=r-1
        if lis[2]=='A':
            a = a+1
        if lis[2]=='S':
            s=s+1
        if lis[2]=='R':
            r=r+1
    if lis[1]=='>':
        if lis[2]=='A':
            a = a-1
        if lis[2]=='S':
            s=s-1
        if lis[2]=='R':
            r=r-1
        if lis[0]=='A':
            a = a+1
        if lis[0]=='S':
            s=s+1
        if lis[0]=='R':
            r=r+1
if (r==a) or (r==s) or (s==a):
    print("Impossible")
else:
    arr = [r,a,s]
    arr.sort()
    for x in arr:
        if x == r:
            print('R',end="")
        if x == a:
            print('A',end="")
        if x == s:
            print('S',end="")