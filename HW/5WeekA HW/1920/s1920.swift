import Foundation

let n = Int(readLine()!)!
let a = Set(readLine()!.split(separator: " ").map { Int($0)! })
let m = Int(readLine()!)!
let b = readLine()!.split(separator: " ").map { Int($0)! }

b.forEach {
    print(a.contains($0) ? 1 : 0)
}
