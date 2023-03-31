fun main(args: Array<String>) {

stmt()
    println(peopleHeight(heights = listOf(1.2,1.4,1.9,1.4,1.0,1.65)))
    people()
   println(car())


}
//1. Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc (2 points)
fun stmt():List<String>{
    val m = mutableListOf("boy","son","daughter","girl","pupil","student","class","pen","book","laptob")
    val evenindices= m.filterIndexed{ index, _ -> index % 2 == 0 }
    println(evenindices)
    return evenindices



}

//2. Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height
fun peopleHeight(heights:List<Double>):List<Double>{
val averageheight= heights.average()
    val totalHeight= heights.sum()
    var both= listOf(averageheight, totalHeight)
    return both



}
//3. Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age (2 points)
data class Person (var name:String, var age:Int, var height:Double, var weight:Double )
fun people(){
    val boy = Person("Ahmed", 23, 1.78, 62.5)
    val girl = Person("Nisa" ,22, 1.63, 57.8)
    val son = Person("Mohamed", 25, 1.87, 68.2)

    val k = listOf(boy,girl,son)
    var sorted=k.sortedByDescending { person1->person1.age }
    println(sorted)
}

//4.Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.
//(1 points)

fun human(){
    val student =Person("Rebecca", 24, 1.70, 52.0)
    val pupil = Person("Nyeliep", 26, 1.63, 55.9)
   val bothh = ("$student")
}


//5.Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.
data class Car(var registration:String, var mileages:Double)
fun car():Double{
    val subaru = Car("KDB23", 22.5)
    val BMW = Car("KFS74", 17.0)
    val rangeRover=Car("KGT65", 15.5)
    val Cars = listOf(subaru,BMW,rangeRover)
    val total = listOf(subaru,BMW,rangeRover)
    var totalmilleage=total.sumOf { mileage->mileage.mileages }
    var averageMilleage=totalmilleage/total.size
    return averageMilleage
}

