fun main (){
    characters()
    println(description("Hunter","23"))
    println(stringLength("Lovelace"))
    name()
}
fun characters (){
    var schoolName = "akirachix"
    print(schoolName[0])
    print(schoolName[2])
    println(schoolName[3])

}
fun description (x:String,y:String):String{
    return "Hi, my name is $x and I am $y years old"
}
fun stringLength (a:String):Int{
    var text = a.length
    return text
}
fun name (){
    var b = "Synthia Achieng"
    if (b == "Synthia Achieng"){
        println("That's me!")
    }
    else{
        println("I don't know who that is")
    }


}