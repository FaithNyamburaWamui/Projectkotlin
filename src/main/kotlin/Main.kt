fun main() {
//    string("Akirachix")
    myCharacter("Valentine")
    myNameAge("Hello" ,20)
    myName("Adalab")
    myString("Kotlin")
    captureStudentRecords("Faith Nyambura", 28,"0118574679", 57.9, true)
    isEven(23)




}
fun string(name: String){
    var a = name[0]
    var b = name[2]
    var c = name[3]

    var result = "$a$b$c"
    println(result)

}

fun myCharacter(word: String){
    var a = word[7]
    var b = word[2]

    var statement = "$a$b"
    println(statement)
}

fun myNameAge(name:String, age:Int):String{
var name = "Hello"
var age = 20
var sentence = "Hi , my name is $name and l am $age years old"
return sentence
}
 fun myName( text:String):Int{   var a = "Kotlin"
      var length = text.length
      return length
}
fun myString(name: String){
    if(name=="Kotlin"){
        println("That's me")
    }else{
        println("I don't know who that is")
    }
}
fun captureStudentRecords(fullname:String, age:Int, phonenumber:String, weightinkg:Double, citizen:Boolean){
    println(fullname)
    println(age)
    println(String)
    println(Double)
    println(Boolean)

}
fun  isEven(Even:Int) {
    var number = 20
    if (number == Even) {
        println(true)
    } else {
        println(false)
    }
}






