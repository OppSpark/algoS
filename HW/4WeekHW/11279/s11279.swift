import Foundation
let num = Int(readLine()!)!
var arry = [Int]()

for _ in 0..<num {
	let x = Int(readLine()!)!
    if x == 0 {
    	arry.sort()
        print(arr.popLast() ?? 0)
    } else {
        arry.append(x)
    }
}