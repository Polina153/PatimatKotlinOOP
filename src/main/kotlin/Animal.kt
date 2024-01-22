abstract class Animal (val name:String, val age:Int){

    abstract fun voice()

    open fun printInfo(){
        println("Animal $name is $age years old")
    }
}