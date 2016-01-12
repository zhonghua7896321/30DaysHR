N = int(input())

def toBinaryNumber(N):
    result = 0
    times = 1
    while (N > 0):
        remainder = N % 2 
        N //= 2
        result += times * remainder
        times *= 10
    print result
        

for i in xrange(N):
    n = int(input())
    toBinaryNumber(n)
