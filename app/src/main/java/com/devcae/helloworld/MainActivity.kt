package com.devcae.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        variablesAndConst()
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
}