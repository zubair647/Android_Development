//If Else

//fun main(){
//    var temp=41;
//    if (temp>40){
//        println("It was burning Hott");
//    }
//}
//
//fun main(){
//    var age=30;
//    if (age>=18){
//        println("You can vote");
//    } else {
//        println("You canvote my age");
//    }
//
//}


//fun main(){
//    var marks=100;
//    if(marks>=90){
//        println("Your grade is 'A'");
//    } else if(marks>=85){
//        println("Your grade is 'B'");
//    } else if(marks>=70){
//        println("Your grade is 'C'");
//    } else {
//        println("Your grade is 'D'");
//    }
//}

// create a calculater in which all arithementi
//fun main(){
//    var operation = "plus" ;
//    var a=10;
//    var b=100;
//    if (operation == "plus"){
//        println("The sum is ${a+b}");
//    } else if (operation == "minus"){
//        println("The subtraction is ${a-b}");
//    } else if (operation == "product"){
//        println("The product is ${a*b}");
//    } else if (operation == "div"){
//        println("The division is ${a/b}");
//    } else if (operation == "mod"){
//        println("The mode is ${a%b}");
//    }
//}


//fun main(){
//    var age =20;
//    if (age <13){
//        println("Child");
//    } else if (age >=13 && age <19){
//        println("Teenage");
//    } else {
//        println("adult");
//    }
//}

////when key word
//fun main(){
//    val dayofweek = 3;
//    val dayname = when(dayofweek){
//        1-> "monday"
//        2-> "tuesday"
//        3-> "wednesday"
//        4-> "thursday"
//        5-> "Friday"
//        6-> "Saturday"
//        7-> "Sunday"
//        else -> "error"
//    }
//    println(dayname);
//}

fun main(){
    val number = 8;
    when {
        number % 2 == 0 -> println("even")
        number % 2 ==1 -> println("odd")
        else -> println("error")
    }
}