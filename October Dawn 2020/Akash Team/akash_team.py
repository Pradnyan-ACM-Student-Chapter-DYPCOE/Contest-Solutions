n = int(input())
count = 0
for i in range(0,n):
    arr = input().split()
    c = 0 
    for ch in arr:
        if ch == 'Y':
            c = c+1
    if c == 2 or c == 3:
        count = count +1
print(count)