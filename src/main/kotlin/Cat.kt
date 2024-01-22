class Cat(name: String, age: Int, private val legs: Int) : Animal(name, age) {
    constructor(name: String) : this(name, age = -1, legs = 4)
    constructor() : this(name = "Undefined", age = -1, legs = 4)

    override fun voice() {
        println("Cat $name makes meow")
    }

    override fun printInfo(){
        println("Cat $name is $age years old and has $legs legs")
    }
}