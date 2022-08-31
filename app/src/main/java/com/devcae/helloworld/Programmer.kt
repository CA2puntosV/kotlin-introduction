package com.devcae.helloworld

class Programmer(val name:String,
                 val age:Int,
                 val languages:Array<Language>,
                 val friends:Array<Programmer>? = null)
{
    fun code(){
        for (language in languages){
            println("Estoy programando en $language")
        }
    }

    enum class Language{
        KOTLIN,
        SWIFT,
        JAVA,
        JAVASCRIPT,
        FLUTTER,
    }
}
