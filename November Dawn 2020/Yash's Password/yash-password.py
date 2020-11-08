n = int(input())
str = input()
c = 0
f1=0
f2=0
f3=0
f4=0
for x in str:
    if x.isupper():
        f1=1
    if x.islower():
        f2=1
    if x.isdigit():
        f3=1
    if x in "!@#$%^&*()-+":
        f4=1
if f1!=1:
    c=c+1
if f2!=1:
    c+=1
if f3!=1:
    c+=1
if f4!=1:
    c+=1
if (n-7)<0:
    rem = 7-n
    if rem>=c:
        print(rem)
    if c>rem:
        print(c)
else:
    print(c)
        