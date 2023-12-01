# https://www.acmicpc.net/problem/1546
import sys
cnt = int(input())
li = []  #
li = list(map(int,input().split()))

max = max(li)
def avg(li, cnt):
    avg = 0
    
    for i in range(cnt):
        avg += li[i]/max * 100
    return avg / cnt

print(avg(li, cnt))

