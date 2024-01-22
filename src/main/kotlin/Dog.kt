class Dog(name: String, age: Int) : Animal(name, age) {
    override fun voice() {
        println("Dog $name is barking")
    }

    override fun printInfo() {
        print("Dog ")
        super.printInfo()
    }
}