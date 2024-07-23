package br.com.alura.alugames.principal

import br.com.alura.alugames.data.Database
import br.com.alura.alugames.modelo.Jogo

fun main(){

    val listOfGames: List<Jogo> = Database.getGames()
    println(listOfGames)

}