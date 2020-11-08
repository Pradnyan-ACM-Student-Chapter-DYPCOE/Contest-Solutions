flag = 0
p = {'A':0,'S':0,'R':0}
for _ in range(3):
    z = input()
    if z[1]=='>':
        p[z[0]]+=1
    else:
        p[z[2]]+=1
t = list(p.values())
if 0 not in t or 1 not in t or 2 not in t:
    print('Impossible')
    flag = 1
ans = [0,1,2]
if (not flag):
    for i in p:
        ans[p[i]]=i
    print(ans[0]+ans[1]+ans[2])
