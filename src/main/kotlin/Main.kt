fun main() {
 //Q1.
    println(peopleNames("mary"))





 //Q4.
   var currentAccount=currentAccount(1234,"mary Jack",5000)
    var x= 1345
    var y = "john"
    var z= 6000


}
//1. Write and invoke one function that takes in a random string and returns the
//following values: first character, last character, length of the string and
//whether it begins with a vowel or not.
fun peopleNames(name:String){

  println( name.length)
  println( name.lastIndex)
  println( name.indexOf(name[0]))

}
//2.Create a function that takes in a password as a parameter. For a password to
//be valid it must meet the following conditions:
//1. Must be at least 8 characters long
//2. Must be at most 16 characters long
//3. Must not be “password”
//4. Must contain a digit
//Your function should determine whether the password provided is valid or not.
//The function returns true/false

fun details(password:String){
    if(password<=8 ){
        println("true")
    }else if(password>=8 && password <=16){
        println("true")
    }if(password=!password){
        println("true or false")
    }else
////
//
//}
//3. Create a function that prints out multiples of 6 and 8 between 1 and 1000. For
//multiples of both 6 and 8 it should print out “Bingo!” (5pts)
fun multiplication(){




}
//4. Create a class CurrentAccount with the following attributes: account number,
//account name, balance. It has the following functions:
//a. deposit(amount: Double) - Increments the balance by the amount
//deposited
//b. withdraw(amount: Double) - Decrements the balance by the amount
//withdrawn
//c. details() - Prints out the account number and balance and name in
//this format: “Account number x with balance y is operated by z” (6pts)
class currentAccount(var accountNumber:Int,var accountName:String,var balance:Int)
fun deposit(amount:Double){
   var balance+=amount
    return deposit
//
//}
//fun withdraw(amount:Double){
    val amount -=withdraw

}
fun details(){
    println("accounnumber $x with balance $y is operated by $z")

}
//5. Create another class SavingsAccount. It has the same functions and
//attributes as the current account except for one attribute, withdrawals: Int.
//Withdrawals is a counter variable that is used to keep track of how many
//withdrawals have been made from the account in a year. The only other
//difference is that the savings account withdraw() method first checks if the
//number of withdrawals is less than 4 for it to allow one to withdraw money
//from the account. It also increments the withdrawals attribute after a
//successful withdrawal (6pts)
//class savingAccount(var accountNumber:Int,var accountName:String,var balance:Int):currentAccount(accountNumber)