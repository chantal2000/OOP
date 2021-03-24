fun main(){
    var person=Human("Chantal",30,50)
    person.eat(30)
    person.speak("Love")
    person.birthday()
    var client=User("Niyonkuru","Marie","nniyonkuruchantal@gmail.com","+250786738069","Chantos2")
    println(client.password)
    println(client.lastName)

}
class Human(var name:String,var age:Int,var weight:Int){
    fun eat(foodWeight:Int){
        println("I am eating $foodWeight Kgs of Food")
        weight=weight+foodWeight
        println(weight)
    }
    fun speak(speech:String){
        println("Love")
    }
    fun birthday(){
        age=age+1
        println(age)
    }
}
data class User(var firstName:String,var lastName:String,var email:String,var phoneNumber:String,var password:String){

}
