#15624번: 피보나치 수 7
def fibo(n):
    dp = [0]*(n+1)
    dp[0],dp[1] = 0, 1

    for i in range(2, n + 1):
        dp[i] = (dp[i - 1] + dp[i - 2]) % 1000000007
    return dp[n]

fibos = int(input())

if(fibos == 0):
    print(0)
    exit()
    

print(fibo(fibos))