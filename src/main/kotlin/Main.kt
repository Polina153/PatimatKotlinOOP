fun main(args: Array<String>) {
    /*val myBox: Box = Box(5.5, 6.6, 7.7)
    println(myBox.volume())
    val box1 = myBox
    println(box1.volume())
    box1.height = 9.9
    println(myBox.volume())
    myBox.compare(box1)*/
    val dog = Dog("Tobik",3)
    val cat = Cat("Murka", 4, 6)
    dog.printInfo()
    cat.printInfo()
    val cat1 = Cat("Murenush")
    cat1.printInfo()
    val cat2 = Cat()

}