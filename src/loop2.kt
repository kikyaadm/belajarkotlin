fun main(args: Array<String>) {
    for (i in 1..5){
        for (x in 4 downTo i){
            print(" ")
        }
        for (y in 1..i){
            print("*")
        }
            println()
    }
}