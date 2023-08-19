import Foundation

let number = Int(readLine()!)!

var arry: [Int] = [1000001]

arry = [0, 1, 0]

for i in 2...number{
    
   // arry[i] = (arry[i - 1] + arry[i-2]) % 1000000007
    arry.insert((arry[i - 1] + arry[i-2]) % 1000000007, at: i )

}

print(arry[number])

