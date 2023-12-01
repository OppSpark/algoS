n = int(input())

value = 0


x = list(map(int, input().split()))
print(x)
value += x[0]
value -= x[1]

for i in range(2, n):
    value += x[i] if value <= 0 else -x[i]

W = [1, 2, 5, 10, 20, 50, 100]
ans = 0

for i in range(6, -1, -1):
    value = abs(value)

    while value >= W[i]:
        ans += value // W[i]
        value %= W[i]

print(ans)
