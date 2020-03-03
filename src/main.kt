fun main(args: Array<String>) {
    // Print Function
    println("Hello World!")
    // Variables
    var a = 0;
    println("a = $a");
    // variables can be modified
    a = 5;
    println("After Modification: a = $a");
    // Values
    val b = 10
    println("b = $b");
    // val is similar to a constant which only allows it to be read only
    // b = 12;

    // Data Types
    val dt1 : Int = 0; // 32 Bit Integer
    val dt2 : String = "Welcome to Kotlin";
    val dt3 : Double = 12.223;
    val dt4 : Boolean = true;

    // Variable Assignment Types
    val vaExample1: Int = 1  // immediate assignment
    val vaExample2 = 2   // `Int` type is inferred
    val vaExample3: Int  // Type required when no initializer is provided
    vaExample3 = 3       // deferred assignment
    


    // Functions
    var additionExample1 = sum(3,2)
    // println("The sum of 3 + 2 = ${3 + 2}")
    // println("The sum of 3 + 2 = ${sum(3,2)}")
    println("The sum of 3 + 2 = $additionExample1")

    // This is an end-of-line comment
    /* This is a block comment
       on multiple lines. */

    var c = 1
    // simple name in template:
    val s1 = "c is $c"

    println(s1)

    c = 2
    // arbitrary expression in template:
    val s2 = "${s1.replace("is", "was")}, but now is $c"

    println(s2)
}

fun sum(a: Int, b: Int): Int{
    return a + b;
}

fun sum2(a: Int, b: Int) = a + b

fun printSum(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}

fun printSum2(a: Int, b: Int) {
    println("sum of $a and $b is ${a + b}")
}