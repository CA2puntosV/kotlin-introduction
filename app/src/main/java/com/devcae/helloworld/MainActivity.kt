package com.devcae.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        variablesAndConst()
        dataTypes()
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
}