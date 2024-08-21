//fun main(){
//    val a=10
//    val b=20
//    val result= "The sum of $a and $b is ${a+b}"
//    println(result);
//}

//

//fun main(){
//    val letter : Char
//    letter = 'A'
//    println("$letter")
//    print('\n')
//    print('\$')
//    print('\\')
//}



//usage of thripple quotes

//fun main(){
//    print("""
//        zubair
//        zubair
//        zubair
//        zubair
//        zubair
//    """)
//}

//fun main(){
//    print("""
//        Zubair
//               Zubair
//                      zubair
//                            zubair
//                            """")
//}

//fun main(){
//    print("""
//            Zubair
//    Zubair          Zubair
//            Zubair
//    """)
//}

//Array

// fun main(){
//     var               marks  = arrayOf(1,2,3,4,5);
//     var words: Array<String> = arrayOf("apple","ball","water","grass");
//     var              Squares = Array(5){i-> i*i};
//     println(marks)
//     println(words)
//     println(Squares)
// }

//fun main() {
//    //Arrays
//    val name=arrayOf("John", "Jack","fasaedsa")
//    val firstName=name[0]
//    val secondName=name[1]
//    val thirdName=name[2]
//    name[2]="Zubair"
//    val changed = name[2];
//    println();
//    println("First Name in Array : ${firstName}")
//    println("Second Name in Array: ${secondName}")
//    println("Third Name in Array : ${thirdName}")
//    println("Changed value from ${thirdName} to ${changed}");
//}

//Multi dimensional array - 2d array
//fun main(){
//    var matrix:Array<Array<Int>> = arrayOf((arrayOf(1,2,3)), arrayOf(3,4,5), arrayOf(5,6,7));
//    println("elements at row 0, colum 1: ${matrix[0][1]}")
//}

//type casting
//fun main(){
//    val x:Int = 100
//    val y:Long = x.toLong()
//    println(y)
//}

//safe and unsafe cast

fun main(){
    var a = "Hellow";
    var b : String = a as String;
    println("Unsafe casting result : $b");

    var c : Int = a as? Int
    println("Unsafe casting result : $c");
}
