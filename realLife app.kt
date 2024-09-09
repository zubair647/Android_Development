fun main(){
    print("Are you a Member:")
    var isMember=readln().toString()
    print("Whats your bill:")
    var totalAmount=readln().toInt()
    if (totalAmount>=1000) {
        if (isMember == "yes") {
            var discountedAmount=totalAmount - (totalAmount*0.2)
            println(" The Amount you need to pay is : $discountedAmount")
        }
        else {
            var discountedAmount=totalAmount - (totalAmount*0.1)
            println(" The Amount you need to pay is : $discountedAmount")
        }
    } else {
        println("No discount!!")
    }
}
