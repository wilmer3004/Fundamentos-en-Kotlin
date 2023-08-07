package com.wilmer3004.fundamentoskotlin.Reto4

class Reto4 {
}
fun main(){
    var nom1:String="Entrada"
    var nom2:String="Plato fuerte"
    var nom3:String="Postre"
    var nom4:String="Bebida"

    var entradas= mutableListOf<MutableList<String>>(mutableListOf(),mutableListOf(), mutableListOf())
    var platosFuertes=mutableListOf<MutableList<String>>(mutableListOf(),mutableListOf(), mutableListOf())
    var postres= mutableListOf<MutableList<String>>(mutableListOf(),mutableListOf(), mutableListOf())
    var bebidas= mutableListOf<MutableList<String>>(mutableListOf(),mutableListOf(), mutableListOf())
    do {
        println("Que desea hacer: ")
        println("1. agregar platos a cada categoria\n2. Mostrar todos los platos creados\n3.Mostrar los platos por codigo\n4. modificar el menu\n5.modificar cada plato\n6. Eliminar un plato")
        var accion = readln().toInt()
        when(accion){
            1->{
                println("${nom1}: ")
                println("Ingrese el nombre:")
                entradas[0]+= arrayOf(readln().toString())
                println("Ingrese la descripcion:")
                entradas[1]+= arrayOf(readln().toString())
                println("Ingrese el precio:")
                entradas[2]+= arrayOf(readln().toString())

                println("${nom2}: ")
                println("Ingrese el nombre:")
                platosFuertes[0]+= arrayOf(readln().toString())
                println("Ingrese la descripcion:")
                platosFuertes[1]+= arrayOf(readln().toString())
                println("Ingrese el precio:")
                platosFuertes[2]+= arrayOf(readln().toString())

                println("${nom3}: ")
                println("Ingrese el nombre")
                postres[0]+= arrayOf(readln().toString())
                println("Ingrese la descripcion:")
                postres[1]+= arrayOf(readln().toString())
                println("Ingrese el precio:")
                postres[2]+= arrayOf(readln().toString())

                println("${nom4}: ")
                println("Ingrese el nombre:")
                bebidas[0]+= arrayOf(readln().toString())
                println("Ingrese la descripcion:")
                bebidas[1]+= arrayOf(readln().toString())
                println("Ingrese el precio:")
                bebidas[2]+= arrayOf(readln().toString())
            }
            2->{
                for (x in entradas[0].indices){
                        println("${x}. La ${nom1} ${entradas[0][x]} tiene como descripcion ${entradas[1][x]} y un precio de $${entradas[2][x]}")
                }
                for (x in platosFuertes[0].indices){
                    println("${x}. El ${nom2} ${platosFuertes[0][x]} tiene como descripcion ${platosFuertes[1][x]} y un precio de $${platosFuertes[2][x]}")
                }
                for (x in postres[0].indices){
                    println("${x}. El ${nom3} ${postres[0][x]} tiene como descripcion ${postres[1][x]} y un precio de $${postres[2][x]}")
                }
                for (x in bebidas[0].indices){
                    println("${x}. La ${nom4} ${bebidas[0][x]} tiene como descripcion ${bebidas[1][x]} y un precio de $${bebidas[2][x]}")
                }
            }
            3->{
                println("Ingrese el tipo de plato que quiere ver: \n1. ${nom1}\n2. ${nom2}\n3. ${nom3} \n4. ${nom4}")
                var plato= readln().toInt()
                println("Ingrese el codigo del plato que quiere ver")
                var cod = readln().toInt()

                when(plato){
                    1->{
                        println("${cod}. La ${nom1} ${entradas[0][cod]} tiene como descripcion ${entradas[1][cod]} y un precio de $${entradas[2][cod]}")
                    }
                    2->{
                        println("${cod}. El ${nom2}  ${platosFuertes[0][cod]} tiene como descripcion ${platosFuertes[1][cod]} y un precio de $${platosFuertes[2][cod]}")
                    }
                    3->{
                        println("${cod}. El ${nom3} ${postres[0][cod]} tiene como descripcion ${postres[1][cod]} y un precio de $${postres[2][cod]}")
                    }
                    4->{
                        println("${cod}. La ${nom4} ${bebidas[0][cod]} tiene como descripcion ${bebidas[1][cod]} y un precio de $${bebidas[2][cod]}")
                    }
                    else->{
                        println("Ingreso un valor no valido")
                    }}

            }

            4->{
                println("Se va a modificar todos los platos del menu")
                for(cod in entradas[0].indices){

                        println("${cod}. La ${nom1} ${entradas[0][cod]} tiene como descripcion ${entradas[1][cod]} y un precio de $${entradas[2][cod]}")
                        println("Ingrese el nombre:")
                        entradas[0][cod]= readln().toString()
                        println("Ingrese la descripcion:")
                        entradas[1][cod]= readln().toString()
                        println("Ingrese el precio:")
                        entradas[2][cod]= readln().toString()


                        println("${cod}. El ${nom2} ${platosFuertes[0][cod]} tiene como descripcion ${platosFuertes[1][cod]} y un precio de $${platosFuertes[2][cod]}")
                        println("Ingrese el nombre:")
                        platosFuertes[0][cod]= readln().toString()
                        println("Ingrese la descripcion:")
                        platosFuertes[1][cod]= readln().toString()
                        println("Ingrese el precio:")
                        platosFuertes[2][cod]= readln().toString()


                        println("${cod}. El ${nom3} ${postres[0][cod]} tiene como descripcion ${postres[1][cod]} y un precio de $${postres[2][cod]}")
                        println("Ingrese el nombre:")
                        postres[0][cod]= readln().toString()
                        println("Ingrese la descripcion:")
                        postres[1][cod]= readln().toString()
                        println("Ingrese el precio:")
                        postres[2][cod]= readln().toString()


                        println("${cod}. La ${nom4} ${bebidas[0][cod]} tiene como descripcion ${bebidas[1][cod]} y un precio de $${bebidas[2][cod]}")
                        println("Ingrese el nombre:")
                        bebidas[0][cod]= readln().toString()
                        println("Ingrese la descripcion:")
                        bebidas[1][cod]= readln().toString()
                        println("Ingrese el precio:")
                        bebidas[2][cod]= readln().toString()

                }
            }

            5->{
                    println("Ingrese el tipo de plato que quiere ver: \n1. ${nom1}\n2. ${nom2}\n3. ${nom3} \n4. ${nom4}")
                        var plato= readln().toInt()
                    println("Ingrese el codigo del plato que quiere ver")
                        var cod = readln().toInt()

                    when(plato){
                        1->{
                            println("${cod}. La ${nom1} ${entradas[0][cod]} tiene como descripcion ${entradas[1][cod]} y un precio de $${entradas[2][cod]}")
                            println("Ingrese el nombre:")
                            entradas[0][cod]= readln().toString()
                            println("Ingrese la descripcion:")
                            entradas[1][cod]= readln().toString()
                            println("Ingrese el precio:")
                            entradas[2][cod]= readln().toString()
                        }
                        2->{
                            println("${cod}. El ${nom2} ${platosFuertes[0][cod]} tiene como descripcion ${platosFuertes[1][cod]} y un precio de $${platosFuertes[2][cod]}")
                            println("Ingrese el nombre:")
                            platosFuertes[0][cod]= readln().toString()
                            println("Ingrese la descripcion:")
                            platosFuertes[1][cod]= readln().toString()
                            println("Ingrese el precio:")
                            platosFuertes[2][cod]= readln().toString()
                        }
                        3->{
                            println("${cod}. El ${nom3} ${postres[0][cod]} tiene como descripcion ${postres[1][cod]} y un precio de $${postres[2][cod]}")
                            println("Ingrese el nombre:")
                            postres[0][cod]= readln().toString()
                            println("Ingrese la descripcion:")
                            postres[1][cod]= readln().toString()
                            println("Ingrese el precio:")
                            postres[2][cod]= readln().toString()
                        }
                        4->{
                            println("${cod}. La ${nom4} ${bebidas[0][cod]} tiene como descripcion ${bebidas[1][cod]} y un precio de $${bebidas[2][cod]}")
                            println("Ingrese el nombre:")
                            bebidas[0][cod]= readln().toString()
                            println("Ingrese la descripcion:")
                            bebidas[1][cod]= readln().toString()
                            println("Ingrese el precio:")
                            bebidas[2][cod]= readln().toString()
                        }
                        else->{
                            println("Ingreso un valor no valido")
                        }
            }}
            6->{
                println("Ingrese el tipo de plato que quiere eliminar: \n1. ${nom1}\n2. ${nom2}\n3. ${nom3} \n4. ${nom4}")
                var plato= readln().toInt()
                println("Ingrese el codigo del plato que quiere eliminar porque ya no existe")
                var cod = readln().toInt()

                when(plato){
                    1->{
                        println("${cod}. La ${nom1} ${entradas[0][cod]} tiene como descripcion ${entradas[1][cod]} y un precio de $${entradas[2][cod]}")
                        entradas[0].removeAt(cod)
                        entradas[1].removeAt(cod)
                        entradas[2].removeAt(cod)

                    }
                    2->{
                        println("${cod}. El ${nom2} ${platosFuertes[0][cod]} tiene como descripcion ${platosFuertes[1][cod]} y un precio de $${platosFuertes[2][cod]}")
                        platosFuertes[0].removeAt(cod)
                        platosFuertes[1].removeAt(cod)
                        platosFuertes[2].removeAt(cod)

                    }
                    3->{
                        println("${cod}. El ${nom3} ${postres[0][cod]} tiene como descripcion ${postres[1][cod]} y un precio de $${postres[2][cod]}")
                        postres[0].removeAt(cod)
                        postres[1].removeAt(cod)
                        postres[2].removeAt(cod)
                    }
                    4->{
                        println("${cod}. La ${nom4} ${bebidas[0][cod]} tiene como descripcion ${bebidas[1][cod]} y un precio de $${bebidas[2][cod]}")
                        bebidas[0].removeAt(cod)
                        bebidas[1].removeAt(cod)
                        bebidas[2].removeAt(cod)
                    }
                    else->{
                        println("Ingreso un valor no valido")
                    }}

            }
            else->{
                println("Ingreso un valor no valido")
            }
        }
        println("Desea realizar otra accion si o no: ")
        var resp = readln().toString().lowercase()
    }while (resp=="si")

}