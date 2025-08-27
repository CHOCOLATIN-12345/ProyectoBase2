package com.example.proyectobase2.utils

import java.lang.ArithmeticException

object OpMatematicas {

    /*Funcion sumar recibe 2 parametros y retorna un numero entero numerico*/
    fun sumar(n1: Int, n2:Int ): Int{
        return  n1+n2
    }

    fun resta(n1: Int, n2: Int): Int{
        return n1-n2
    }

    fun dividir(n1: Int, n2: Int): Int {
        try {
            return n1*n2
        }catch (e:ArithmeticException){
            return 0
        } finally {
            println("Se ha producido un error")
        }
    }

    fun multiplicar(n1: Int, n2: Int): Int{
        return n1*n2

    }
}