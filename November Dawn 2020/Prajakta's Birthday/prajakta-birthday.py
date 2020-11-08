from itertools import combinations
from math import factorial

n = int(input())
x = [i for i in range(n)]
c = len(list(combinations(x,n//2)))
p = pow(factorial(n//2 - 1),2)
print((c*p)//2)