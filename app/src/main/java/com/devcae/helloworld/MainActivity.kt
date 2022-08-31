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
        //Lesson 6
        maps()
        //Lesson 7
        loops()
        //Lesson 8
        nullSafety()
        //Lesson 9
        functions()
        //Lesson 10
        classes()
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
    Estructuras que sirven para agrupar diferentes tipos de datos
    en una única estructura. Es una estructura ordenada, dependiendo de los
    datos que se vayan agregando, así mismo los va mostrando
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
        //myArray.first() //First element
    }

    /*MAP OR DICTIONARY
    Estructura desordenada, se agrupan por clave - valor (key : value)
    las claves deben ser del mismo tipo y los valores deben ser del mismo tipo,
    y las claves no pueden repetirse
    */
    private fun maps(){

        var myMap: Map<String, Int> = mapOf()
        println("MY MAP: $myMap")

        //Add data
        myMap = mutableMapOf("Cristian" to 1, "Brais" to 2) //Destroy previous data and add new values
        println("ADD DATA: $myMap")

        //Add only one value
        myMap["CAE"] = 7
        myMap.put("CAEE" , 10)
        println("ADD ONE VALUE: $myMap")

        //Data update
        myMap.put("Cristian", 6)
        myMap["XD"] = 7
        println("UPDATE: $myMap")

        //Data access
        println("ACCESS: ${myMap["Cristian"]}")

        //Remove data
        myMap.remove("XD")
        print("REMOVE $myMap")
    }

    /*LOOPS
    Sirven para recorrer estructuras que almacenan conjuntos
    de datos (MAPS / ARRAYS)
    */
    private fun loops(){

        val myArray:List<String> = listOf("Hello World", "My Kotlin App", "xD")
        val myMap:Map<String, Int> = mapOf( "Cristian" to 1 , "Pedro" to 2, "Macaco" to 3)

        //Array con rango numerico
        val myNumericArray = (0..20)

        // FOR LOOP
        for (item:String in myArray){
            println("MY ARRAY: $item")
        }

        for (item in myMap){
            println("KEY: ${item.key} VALUE ${item.value}")
        }

        //Ranges and progressions
        //Al hacer el recorrido incluye los valores 0 y 10
        println("..")
        for(x in 0..10){
            println(x)
        }

        //Al hacer el recorrido excluye los valores 0 y 10
        println("UNTIL")
        for(x in 0 until 10){
            println(x)
        }

        //Saltos en los incrementos, en este caso mostrando números pares
        println("STEP")
        for(x in 0..10 step 2){
            println(x)
        }

        //Cuenta regrevisa (10 a 0)
        println("DOWN TO")
        for(x in 10 downTo 0 step 3){
            println(x)
        }

        //WHILE
        var x = 0

        while (x < 10){
            println(x)
            x += 2
        }
    }

    /*NULL SAFETY (NULL POINTER EXCEPTION)
    Seguridad contra nulos, para evitar que durante la
    ejecución del programa lleguen valores vacíos y así
    evitar errores
    */
    private fun nullSafety(){

        var myString = "Cristian"
        //ERROR -> myString = null
        println(myString)

        //Nullable variable
        var safetyString:String? = "XD"
        safetyString = null
        println(safetyString)

        //println("No null ${safetyString!!}") ➡ NullPointerException

        /* ⬆ COMPROBACIONES (IF / ELSE) NO RECOMENDADAS, YA QUE PUEDE SER COSTOSO EL ESTAR
        COMPROBANDO PARA TODAR LAS VARIABLES.
        POR LO TANTO, TENER EN CUENTA ⬇*/

        //SAFE CALL
        println(safetyString?.length)

        safetyString?.let {
        //SE EJECUTARÁ CUANDO LA VARIABLE NO SEA NULL
            println("VALUE: $it")
        } ?: run {
            //SE EJECUTARÁ CUANDO LA VARIABLE SEA NULL
            println(safetyString)
        }
    }

    /*FUNCTIONS
    TROZO DE CODIGO PARA DESEMPEÑAR ALGUNA TAREA
    AL SER UN CÓDIGO INDEPENDIENTE, NO AYUDARÁ A LA
    REUTILIZACIÓN DE CÓDIGO
    */
    private fun functions(){
        sayHello()
        sayHello()
        sayMyName("Cristian")
        sayMyNameAndAge("Brais", 32)
        val sum = sunTwoNumbers(4, 9)
        println(sum)
        //println(sunTwoNumbers(4, 9))
        //println(sunTwoNumbers(10, sunTwoNumbers(5, 5))) concatenar funciones

    }

    private fun sayHello(){
        println("Hola!")
    }

    //Funciones con parámetros de entrada
    /*1️⃣*/private fun sayMyName(name:String){
        println("Hola, mi nombre es $name")
    }
    /*2️⃣*/private fun sayMyNameAndAge(name:String, age:Int){
        println("Hola, mi nombre es $name y mi edad es $age")
    }

    //Funciones con valor de retorno
    fun sunTwoNumbers(firstNum:Int, secondNum:Int) :Int {
        val value = firstNum + secondNum
        return value
    }

    /*CLASSES / OBJECT
    Es una construcción flexible, de uso general, para
    definir nuevos tipos. Pueden contener en su interior
    propiedades y métodos
    */
    private fun classes(){

        val cristian = Programmer("Cristian", 20, arrayOf(Programmer.Language.FLUTTER))
        println(cristian.name)
        cristian.code()

        val sara = Programmer(
            "Sara", 30, arrayOf(Programmer.Language.JAVA, Programmer.Language.JAVASCRIPT,), arrayOf(cristian)
        )
        println("-------")
        println(sara.name)
        sara.code()
        println("${sara.friends?.first()?.name} es amigo de ${sara.name}")
    }
}