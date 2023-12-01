#https://www.acmicpc.net/problem/1010
import math
cnt = int(input())

for _ in range(cnt):
    w, e = map(int,input().split())
    print(math.factorial(e)//(math.factorial(w)*math.factorial(e - w)))

