package br.com.alura.alugames.principal

import br.com.alura.alugames.data.Database
import br.com.alura.alugames.data.JogosDAO
import br.com.alura.alugames.modelo.Jogo

fun main() {

    val dao = JogosDAO()
    val game = Jogo(
        "The Last of Us Part I",
        "https://cdn.cloudflare.steamstatic.com/steam/apps/1888930/header.jpg?t=1686864554",
        5.99,
        "Uma aventura pós-apocalíptica de sobrevivência em um mundo infestado por zumbis e facções em conflito."
    )
    dao.addGame(game)
    val listOfGames: List<Jogo> = dao.getGames()
    println(listOfGames)

}