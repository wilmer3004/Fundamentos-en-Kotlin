package com.wilmer3004.fundamentoskotlin.Reto2

class Reto2 {
}

fun main(){
    var album= mutableListOf<Array<String>>(arrayOf(), arrayOf(), arrayOf(), arrayOf())

    println("Ingrese la cantidad de canciones que tiene el album: ")
    var nC = readln().toInt()
    println("Ingrese el tipo de musica que tiene el album: ")
    var tipoMusica = readln().toString()

    for (i in 1..nC){
        println("Ingrese el titulo de la cancion de la posicion ${i}: ")
        album[0]+=(arrayOf(readln().toString()))

        println("Ingrese el artista de la cancion de la posicion ${i}: ")
        album[1]+=(arrayOf(readln().toString()))

        println("Ingrese el año de la cancion de la posicion ${i}: ")
        var anio = readln().toInt()
        album[2]+=(arrayOf(anio.toString()))

        println("Ingrese la cantidad de reproducciones de la cancion de la posicion ${i}: ")
        var reproduccion = readln().toInt()
        album[3]+=(arrayOf(reproduccion.toString()))
    }
    var cancionPopular = album[3].maxOrNull()

    println("Estas son las cantidades de reproducciones almacenadas en el album: ")
    for (reproducciones in album[3]){
        println(reproducciones)
    }
    println()
    for (x in album[3].indices){
        if (album[3][x] == cancionPopular){
            println("La cancion mas popular es ${album[0][x]} con ${album[3][x]} reproducciones")
        }
    }


    for (x in album[3].indices){
        if (album[3][x].toInt()>=1000){
            println("La cancion ${album[0][x]} con ${album[3][x]} reproducciones es mas popular")
        }
        else if (album[3][x].toInt()<=1000 && album[3][x].toInt()>0) {
            println("La cancion ${album[0][x]} con ${album[3][x]} reproducciones es poco popular")
        }
        else{

        }
    }

    for (x in album[0].indices){
            println("${album[0][x]}, interpretada por ${album[1][x]}, se lanzó en ${album[2][x]}, con ${album[3][x]} reproducciones.")
    }


}



