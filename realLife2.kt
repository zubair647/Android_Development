fun main(){
    print("What was your current balance")
    var totBal=readln().toInt()
    var i="yes"
    var curr=totBal
    while(i=="yes"){
        if(curr<=totBal){
            println("Do you want to withdraw");
            var response= readln().toString()
            if(response=="yes"){
                print("how much you need to withdrw")
                var amount = readln().toInt()
                curr=curr-amount
                println("Your current balance is $curr")
            }
        } else {
            i == "no"
            break
        }
    }
}