fun main(args: Array<String>) {
    val myBox: Box = Box(5.5, 6.6, 7.7)
    println(myBox.volume())
    val box1 = myBox
    println(box1.volume())
    box1.height = 9.9
    println(myBox.volume())
    myBox.compare(box1)
}