import sys
K, N = map(int, input().split())  # 수 입력

lan = [int(sys.stdin.readline()) for _ in range(K)] # 길이

s, e = 1, max(lan)  #처음 끝위치 설정

while s <= e: # 길이를 찾는 알고리즘
    mid = (s + e) // 2 
    lines = 0 #랜선 수
    for i in lan:
        lines += i // mid 
        
    if lines >= N: 
        s = mid + 1
    else:
        e = mid - 1
print(e)