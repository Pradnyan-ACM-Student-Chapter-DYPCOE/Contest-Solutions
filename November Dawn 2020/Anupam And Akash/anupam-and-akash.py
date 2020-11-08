n,t = list(map(int,input().split()))
time = list(map(int,input().split()))
total_time = sum(time)
if (total_time+(10*(n-1)))>t:
    print("-1")
else:
    prbSol = (t-total_time)//5
    print(prbSol)