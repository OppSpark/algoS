#5622

strin = str(input())
a = ['ABC', 'DEF', 'GHI', 'JKL', 'MNO', 'PQRS', 'TUV', 'WXYZ']
b = 0
for i in strin:
    for j in range(len(a)):
        if i in a[j]:
            b += j + 3
print(b)
