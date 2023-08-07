package com.wilmer3004.fundamentoskotlin.Reto1

class Reto1 {
}
fun main(){

    var telefonos = mutableListOf<Array<String>>(arrayOf(), arrayOf(), arrayOf())
    var cont1=0

    do{

        println("Digite el numero de telefono de la posicion ${cont1} que desea ingresar:")
        var telefono= readln().toString()

        telefonos[0]+=arrayOf(telefono)

        println("Digite el numero de notificaciones del numero de la posicion ${cont1} que desea ingresar:")
        var cantNot=readln().toInt()
        if (cantNot<100 && cantNot>0) {
                telefonos[1] += arrayOf(cantNot.toString())
                telefonos[2] += arrayOf("El numero de telefono ${telefonos[0][cont1]} tiene una cantidad de notificaciones de ${telefonos[1][cont1]}")
            }
            else if (cantNot>=100){
                telefonos[1] += arrayOf("99+")
                telefonos[2] += arrayOf("El numero de telefono ${telefonos[0][cont1]} tiene una cantidad de notificaciones de ${telefonos[1][cont1]}")
            }
            else if(cantNot==0){
                telefonos[1] += arrayOf("0")
                telefonos[2] += arrayOf("El numero de telefono ${telefonos[0][cont1]} tiene una cantidad de notificaciones de ${telefonos[1][cont1]} por lo tanto no existen mensajes disponibles")
            }
        else{
            println("Se ingreso un dato no valido en canntidad de notificaciones")
        }

        println("Desea ingresar otro numero si o no: ")
        var resp = readln().toString().lowercase()
        cont1 +=1
    } while(resp=="si")

    for (x in telefonos[2].indices){
       println(telefonos[2][x])
    }
}