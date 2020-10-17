t = int(input())
for x in range(0,t):
    n  = int(input())
    if(n==0):
        print(-1)
    else:
        score = list(map(int,input().split()))
        score.sort(reverse=True)
        freq = {}
        for sc in score:
            if sc in freq:
                freq[sc]+=1
            else:
                freq[sc]=1
        if(len(freq)==1):
            print(-1)
        else:
            i=1;
            for val in freq:
                if(i==2):
                    print(val)
                i=i+1
