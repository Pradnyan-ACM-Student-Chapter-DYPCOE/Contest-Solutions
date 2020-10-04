def maxSum(arr, k):
    m = pow(10,9)+7 
    max_sum = 0
    sum = 0
      
    if k ==1: #kadane algorithm    
        for x in arr:
            sum = max(x,sum+x)
            max_sum = max(sum,max_sum)
        return max_sum
    for i in range(2):
        for x in arr:
            sum = max(x,sum+x)
            max_sum = max(sum,max_sum)
    min_sum = 0
    for x in arr:
        min_sum +=x
    if min_sum<0:
        max_sum
    else:
        max_sum =( max_sum +((k-2)*(min_sum)) %m)
    return max_sum

t  = int(input())
for i in range(t):
    n,m = list(map(int,input().split()))
    arr = list(map(int,input().split()))
    sum = maxSum(arr,m)
    print(sum)
