
import sys

n, k = map(int, input().split())

nums = [i + 1 for i in range(n)]

print("<", end="")

while nums:
    for i in range(k):
        if i == k-1:
            print(nums.pop(0), end="")
            break
        nums.append(nums[0])
        del nums[0]

    if nums:
        print(", ", end="")

print(">")