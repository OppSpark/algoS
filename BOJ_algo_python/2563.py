
cnt = int(input())

R = [[0 for i in range(101)] for i in range(101)]



for x in range(cnt):
    a, b = map(int,input().split())
    for i in range(a, a +10):
        for j in range(b ,b+10):
            R[i][j] = 1

sum = 0
for i in R:
    sum += i.count(1)


print(sum)



