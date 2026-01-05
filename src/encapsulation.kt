fun main() {
  val account:BankAccount = BankAccount()
    account.deposit(500.0)
    account.withdraw(100.0)

    println("Final bank account balance ${account.getBalance()}")

    val person : Person = Person()
    person.name = "reda"
    person.address = "Cairo ,Egypt"
    person.birthday()
    person.showInfo()

    val user : User = User()
    println(user.name)
    user.name = "reda"
    println(user.name)
    user.name = ""
}




class BankAccount{
    private var balance : Double = 0.0

    fun deposit(amount : Double){
        if(amount>0){
            balance += amount
            println("Deposited $amount , Current balance is $balance")
        }else{
            println("Amount must be non-negative balance (Current balance is $balance)")
        }
    }

    fun withdraw(amount : Double){
        if(amount>0 && amount<=balance){
            balance -= amount
            println("Withdraw $amount , Current balance is $balance")
        }else{
            println("Withdraw amount is invalid!")
        }
    }

    fun getBalance() : Double{
        return balance
    }
}

class Person{
    var name:String = ""
    private var age:Int = 0
    internal  var address:String = "Unknown address"

    fun showInfo(){
        println("Name: $name , Age: $age , Address: $address")
    }

    private fun increaseAge(){
        age+=1
    }

    fun birthday(){
        increaseAge()
        println("Happy Birthday new age is $age years old")
    }
}

class User{
    var name:String = "anonymous"
        get() = field
    set(value) {
        if (value.isNotEmpty()){
            field = value
        }else{
            println("Name is empty")
        }
    }
}