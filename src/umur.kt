fun main(args: Array<String>) {
    print("Enter your DOB : ")
    var DOB:Int= readLine()!!.toInt()

    var year=2017
    var age:Int?
    age=year-DOB

    println("Your age is $age years")
}