package com.wilmer3004.fundamentoskotlin.Reto5

import kotlin.random.Random

class Reto5 {
}
fun main(){
//Declaramos variables
    val usuario: Long = 3182441234
    val password:Int=1234
    var saldo:Int=4500
    var intentos = 3
//Acceso
    for (int in 1..3) {
        println("Tienes ${intentos} intentos para iniciar secion")
    println("Ingrese su numero de telefono de 10 digitos como usuario:")
    var numTelefono:Long= readln().toLong()
    println("Ingrese su contraseña de cuatro digitos: ")
    var password1:Int= readln().toInt()
        if (numTelefono == usuario && password == password1) {
            do{
                println("Su saldo actual disponible es de $${saldo}")

                println("Ingrese la accion que desea realizar:")
                println("1. Saca\n2. Envía \n3. Recarga \n4. Salir")
                var accion = readln().toInt()
                when(accion){
                    1->{
                        println("1. Cajero\n2. Punto fisico\n Elija: ")
                        var opcion = readln().toInt()

                        if(opcion==1){
                            if(saldo<2000 && saldo>=0){
                                println("No te alcanza")
                            }
                            else if(saldo>=2000){
                                println("Ingrese el valor de retiro")
                                var retiro = readln().toInt()
                                println("El codigo de retiro en punto fisico es el siguiente: ")
                                println((100000..999999).random())
                            }
                            else {}
                        }
                        else if(opcion==2 ){
                            if(saldo<2000 && saldo>=0){
                                println("No te alcanza")
                            }
                            else if(saldo>=2000){
                                println("Ingrese el valor de retiro")
                                var retiro = readln().toInt()
                                println("El codigo de retiro en cajero es el siguiente: ")
                                println((100000..999999).random())
                            }
                            else {}
                        }
                        else{
                            println("Digito un valor invalido")
                        }
                    }
                    2->{
                        println("Ingrese el numero de telefono al cual desea enviar el dinero:")
                        var numTele2 = readln().toLong()
                        println("Ingrese la cantidad de dinero que desea enviar: ")
                        var cantDinero = readln().toInt()

                        if(cantDinero<=saldo && cantDinero>0){
                            println("El envio fue correcto")
                            saldo-=cantDinero
                        }
                        else{
                            println("No es posible enviar el dinero")
                        }
                    }
                    3->{
                        println("Ingrese la cantidad de dinero que desea recargar: ")
                        var canRecarga = readln().toInt()
                        println("Confirme que desea realizar la recarga si o no")
                        var confirmacion = readln().toString().lowercase()
                        if (confirmacion=="si"){
                            println("Su recarga fue exitosa")
                            saldo+=canRecarga
                        }
                        else{
                            println("Usted decidio no hacer la recarga o escribio una respuesta incorrecta")
                        }
                    }
                    4->{break}
                    else-> println("Ingreso un valor no valido")
                }
                println("Desea realizar otra accion si o no: ")
                var resp = readln().toString().lowercase()
            }while (resp=="si")

        } else {
            println("¡Upps! Parece que tus datos de acceso no son correctos, Tienes tres intentos más  ")
        }
        intentos-=1
    }
    println("Saliste del programa o se te acabaron los intentos para iniciar sesión")
}