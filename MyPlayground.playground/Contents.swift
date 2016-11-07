//: Playground - noun: a place where people can play

import UIKit

var str = "Hello, playground"

var a1: Double
let a2:Float
a1 = 70
a2 = 70

let name = "A"
"Hello" + name + "!"

var occupations = [
    "Malcolm": "Captain",
    "Kaylee": "Mechanic",
]
//occupations = [:]

var optionalString: String? = "Hello"
print(optionalString == nil)

var optionalName: String? = nil
var greeting = "Hello!"
if let name = optionalName {
    greeting = "Hello, \(name)"
} else {
    print(occupations)
}

let vegetable = "red pepper"
switch vegetable {
case "celery":
    print("Add some raisins and make ants on a log.")
case "cucumber", "watercress":
    print("That would make a good tea sandwich.")
case let x where x.hasSuffix("pepper"):
    print("Is it a spicy \(x)?")
default:
    print("Everything tastes good in soup.")
}

