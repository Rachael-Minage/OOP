fun main(){
    var person = Human("Rachael Minage",23,52)
person.eat(3)
    println(person.weight)
    person.speak("I am coding today")
    person.birthday(1)
var Rachael=User("Rachael","Minage","rachael09@gmail.com",254746789654,"radish")
println("${Rachael.lastName} ${Rachael.email}" )





}
class Human(var name: String,var age: Int,var weight: Int){
    fun eat(foodWeight: Int): Int{
println("I am eating ${foodWeight}kg of food.")
       weight+=foodWeight
        return weight



    }
    fun speak(speech: String){
        println(speech)



    }
    fun birthday(years: Int): Int{
        age+=years
        println(age)
        return age


    }

}
data class User(var firstName: String, var lastName: String, var email: String,var phoneNUmber: Long,var password:String){

}