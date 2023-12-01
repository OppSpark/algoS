# https://www.acmicpc.net/problem/10871
import sys
li = []
li2 = []

n, m = (map(int,input().split()))
li = list(map(int, input().split()))

for i in range(n):
    
    if li[i] < m :
        li2.append(li[i])

for i in range(len(li2)):
    print(li2[i],end=" ")
