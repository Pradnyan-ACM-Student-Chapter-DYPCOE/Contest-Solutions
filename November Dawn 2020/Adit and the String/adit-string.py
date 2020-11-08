n = int(input())
s = input()
count=0
lent=0
maxi=0
for x in s:
    if x=='0':
        count+=1
        lent+=1
    else:
        count-=1
        lent+=1
    if count==0:
        maxi = max(maxi,lent)
        lent=0
print(maxi)