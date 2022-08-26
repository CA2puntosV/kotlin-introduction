package com.devcae.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Lesson 1
        variablesAndConst()
        //Lesson 2
        dataTypes()
        //Lesson 3
        ifStatement()
        //Lesson 4
        whenSentence()
        //Lesson 5
        arrays()
    }

    /*VARIABLES AND CONSTANTS
     var = Las variables después de definirlas podemos cambiar su valor (reasignación/mutable).
     val = Las constantes no cambian su valor después de ser difinidas (inmutable).
*/
    private fun variablesAndConst(){
        //VARIABLES
        var myFirstVariable = "Variable Hello World!"
        println(myFirstVariable)

        //Here myFirstVariable was reassigned
        myFirstVariable = "Welcome to my first Kotlin app!"
        println(myFirstVariable)

        //CONSTANTS
        val myFirstConstant = "Constant Hello World"
        println(myFirstConstant)

        //myFirstConstant = "Reasinación" (Val cannot be reassigned)
    }

    /*DATA TYPES
     consisting of: String, integer, decimal and bool
     example: myString:String - myInteger:int - myDecimal:Double - myBool:Boolean
    */
    private fun dataTypes(){

        //String
        val myString = "Hello Cristian, Welcome to"
        val myString2 = "MoureDev's Kotlin Course"
        val myString3 = "$myString $myString2" //String interpolation ("$variable")
        println(myString3)

        //Integer Numbers (Byte, Short, Int, Long)
        val myInt = 1
        val myLongInt = 1054654645
        val sum = myInt + myLongInt
        println(sum)

        //Decimal (Float (32 bit), Double(64 bit))
        val myFloat = 3.1416f
        val myDouble = 1.5
        println("Float $myFloat and Double $myDouble")

        //Boolean (true, false) //Logical data type
        val myBool = true
        val myBool2 = false
        println(myBool == myBool2)
        println(myBool && myBool2)
    }

    /*IF ELSE STATEMENT
    Conditional operator  ( > , < , >=, <=, ==, != )
    Logical operator (&& (y), || (o), ! (no))
    💡TIP: Ranges and progressions: myNumber2 in 6..10 is equivalent to myNumber2 <= 10 && myNumber2 > 5
    */
    private fun ifStatement(){
        val myNumber = 50
        val myNumber2 = 72

        //Conditional operator
        if (myNumber < 10){
            println("My number $myNumber is less than 10")
        } else {
            println("$myNumber is greater than 10")
        }

        //Logical operator
        if ((myNumber2 <= 10) || /*&&*/ myNumber2 > 53){
            println("$myNumber2 is less than or equal to 10, and greater than 5 or is equal to 53")
        } else if (myNumber2 == 60){
            println("$myNumber2 is 60")
        } else {
            println("$myNumber2 is greater than 10, and isn't equal to 53")
        }
    }

    /*WHEN SENTENCE
    (SWITCH IN OTHER LANGUAGES)
    The func call is: "value" -> {}
    The default value is: else -> {}
    */
    private fun whenSentence(){
        val country = "Mexico"
        val age = 12

        //Strings
        when(country){
            "Spain", "Mexico", "Colombia", "Argentina" -> {
                println("The mother tongue is Spanish")
            }
            "United States" -> {
                println("The mother tongue is English")
            } else -> {
                println("Unrecognized language")
            }
        }

        //Integer
        when(age){
            0, 1, 2, 3 -> {
                println("You're a baby")
            } in 3..13 -> {
                println("You're a kid")
            } in 14..18 -> {
                println("You're adolescent")
            } in 19..69 -> {
                println("You're adult")
            } in 70..99 -> {
                println("You're elder")
            } else -> {
                println("😲")
            }
        }
    }

    /*ARRAY

     */
    private fun arrays(){
        val name = "Cristian"
        val surName = "Acevedo"
        val company = "Ibacrea"
        val age = "20"

        val myArray = arrayListOf<String>() //Here created List of strings

        //Add data one by one
        myArray.add(name)
        myArray.add(surName)
        myArray.add(company)
        myArray.add(age)
        println("MyArray: $myArray")

        //Add set of data
        myArray.addAll(listOf("Damn", "XD"))
        println("Position 0: ${myArray[0]}")

        //Modify data
        myArray[3] = "Modified"
        println("Modify: $myArray")

        //Delete
        myArray.removeAt(3)
        println("Deleted Pos 3: $myArray")

        //Scroll through data
        myArray.forEach {
            println("it $it") //It is the value in each iteration
        }

        //Other
        myArray.count() //Array amount
        myArray.clear() //Remove all elements
        myArray.first() //First element
    }
}