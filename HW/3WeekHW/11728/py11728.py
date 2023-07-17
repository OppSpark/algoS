import sys
input = sys.stdin.readline

N, M = map(int, input().split())

arr1 = list(map(int, input().split()))
arr2 = list(map(int, input().split()))

ai = 0
bi = 0

printt = []

while 1:
    if arr1[ai] <= arr2[bi]:
        printt.append(arr1[ai])
        ai += 1
    else:
        printt.append(arr2[bi])
        bi += 1
    if ai == N or bi == M:
        printt += arr1[ai:] + arr2[bi:]
        break

print(*printt)