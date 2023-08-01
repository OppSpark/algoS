import Foundation

var n = Int(readLine()!)!
var cnt = 0
while n >= 0 {
    if n % 5 == 0{
        cnt += (n / 5)
        print(cnt)
        break
    }
    n -= 3
    cnt += 1
    
    if 1..<3 ~= n{
        print(-1)
    }
}
