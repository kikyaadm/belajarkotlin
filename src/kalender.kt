import java.util.*

fun main(args: Array<String>) {
    print("Enter your DOB : ")
    var DOB:Int= readLine()!!.toInt()

    var year=Calendar.getInstance().get(Calendar.YEAR)
    var Age:Int?
    Age=year-DOB

    println("Your age is $Age years")
}