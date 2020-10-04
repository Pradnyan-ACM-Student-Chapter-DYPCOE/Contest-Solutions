from collections import deque

t = int(input())
arr  = list(map(int,input().split()))
q = int(input())
for i in range(q):
    op = input().split()
    if op[0] == 'I':
        arr = [x+int(op[1]) for x in arr]
    if op[0] == 'D':
        arr = [x-int(op[1]) for x in arr]
    if op[0] == 'L':
        final_list = deque(arr) 
        final_list.rotate(-1)    
        arr = list(final_list)
    if op[0] == 'R':
        final_list = deque(arr) 
        final_list.rotate(1)    
        arr = list(final_list)
for x in range(len(arr)):
    print(arr[x],end =" ")
            