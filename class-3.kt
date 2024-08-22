//operators

fun main(){
    var a=10;
    var b=6;
    //arithemetic operator
    var Sum= a+b;
    println ( "Addition: ${a} + ${b} = ${Sum}");
    println( "Subtraction of $a and $b = ${a-b}")
    println("Multiplication of $a and $b = ${a*b}")
    println("Division of $a and $b = ${a-b}")
    println("Remainder of $a and $b = ${a%b}")

    //relational operators
    println("is $a == $b ? Ans: ${a==b} ")
    println("Is $a != $b? Ans: ${a!=b} ");
    println("Is $a >= $b? Ans: ${a>=b}")
    println("Is $a > $b? Ans: ${a>b}")
    println("Is $a <= $b? Ans: ${a<=b}")
    println("Is $a < $b? Ans: ${a<b}")

    //Assigment Operators
    var c=20;
    c+=b;
    println(c)
    c-=b;
    println(c)
    c*=a;
    println(c)
    c/=2;
    println(c)
    c%=3;
    println(c)
    println()
    println()

    //Urinary operators
    a++;
    println(a)
    b--
    println(b)
    +a
    println(a)
    println(-a)
    println(!true)
    println()

    //Logical Operators
    //And Operator
    println("****And Operator****")
    println("True and true = ${true&&true}")
    println("true and false = ${true&&false}")
    println("false and true = ${false&&true}")
    println("False and False = ${false&&false}")
    //And Operator
    println("****OR Operator****")
    println("True or true = ${true||true}")
    println("true or false = ${true||false}")
    println("false or true = ${false||true}")
    println("False or False = ${false||false}")
}