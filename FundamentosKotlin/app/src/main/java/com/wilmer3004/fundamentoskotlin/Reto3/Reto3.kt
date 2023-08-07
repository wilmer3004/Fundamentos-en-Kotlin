package com.wilmer3004.fundamentoskotlin.Reto3

class Reto3 {
}
fun main(){
var subasta = mutableListOf<Array<String>>(arrayOf("Menta con forma de Nicki minaj","Huella de  pie grande","Posion de amor","Diario de Albert Eninstein"), arrayOf("500000","1500000","10000000","60000000"))
for (x in subasta[0].indices){
    println("El objeto subastado es ${subasta[0][x]} con un precio inicial de $${subasta[1][x]}")
    var objetoSubastado = subasta[1][x].toInt()
    var objetoSubastado1=objetoSubastado
    do {
        objetoSubastado1 += 100000
        println("quien da mas, escuche decir $${objetoSubastado1} ")
        println("Alguien da mas si o no")
        var resp= readln().toString().lowercase()
        if(resp=="si"){
            objetoSubastado+=100000
        }
        else{
        }
    }while (resp=="si")
    if(objetoSubastado == subasta[1][x].toInt()){
        println("El objeto ${subasta[0][x]} ha sido vendido a la casa por $${objetoSubastado}")
    }
    else{
        println("El objeto ${subasta[0][x]} ha sido vendido por $${objetoSubastado}")
    }

}


}