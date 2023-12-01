import sys
import heapq

input = sys.stdin.readline
num = int(input())
h = []

for _ in range(num):
    x = int(input())
    if x == 0:
        if not h:
            print(0)
        else:
            print(heapq.heappop(h))
    else:
        heapq.heappush(h, x)
