fun main() {
    val grades = listOf(75, 80, 90, 85, 95)
    val average_grade = calculate_average_grade(grades)
    println("The average grade is $average_grade")
    var x=Ankara("colorful")
    println(x.patternDesign(26.0,"happy"))
}
fun calculate_average_grade(grades: List<Int>): Double {
    var sum = 0
    for (grade in grades) {
        sum += grade
    }
    return sum.toDouble()/ grades.size
}


class Ankara(var pattern:String){
    fun patternDesign(temperature:Double,mood:String):String{
        if(temperature<=26.0 && mood=="happy"){
            return("$pattern changed to floral")
        }
        else{
            return ("$pattern did not change")
        }
    }
}



