import Foundation

let num = Int(readLine()!)! //후보 수
var h1 = Int(readLine()!)! // 1찍남
var v = [Int](repeating: 0, count: 101) // 2찍남

var cnt = 0 // 매수하는 수

for _ in 0...num - 2{   //값 입력 받고 내림 차순 정렬
    v.append(Int(readLine()!)!)
}
    v.sort(by: >)

if num == 1{
    print(0)
}
else{  //표가 많은 사람 매수하는 알고리즘
    while v[0] >= h1{
        h1 += 1
        v[0] -= 1
        cnt += 1
        v.sort(by : >)
    }
    print(cnt)
}
