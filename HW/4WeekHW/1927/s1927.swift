import Foundation

let num = Int(readLine()!)!
var push = 0
var arry = [Int]()


for _ in 1...num{
    push = Int(readLine()!)!
    if push != 0{
        arry.append(push)
    }
    else{
        arry.sort(by: >)
        print(arry.popLast())
    }
}




