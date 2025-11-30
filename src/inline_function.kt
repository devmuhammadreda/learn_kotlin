fun main() {
    val list = listOf<Int>(1,2,3,4,5,6,7,8,9,10)
    numProcess(list , {println(it)})
}


 fun greet(name : String){
    println("hi $name")
}


inline fun numProcess(numbers : List<Int> ,action: (Int)-> Unit ){
   for (i in  numbers){
       action(i)
   }
}