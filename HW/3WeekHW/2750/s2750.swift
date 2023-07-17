import Foundation

let number = Int(readLine()!)!

var arry: [Int] = []

for _ in 0..<number{
    arry.append(Int(readLine()!)!)
}

for i in 0..<number{
    for j in i + 1..<number {
        if arry[i] > arry[j]{
            let tm = arry[i]
            arry[i] = arry[j]
            arry[j] = tm
        }
    }
}
for k in 0..<number {
    print("\(arry[k])")
    
}
