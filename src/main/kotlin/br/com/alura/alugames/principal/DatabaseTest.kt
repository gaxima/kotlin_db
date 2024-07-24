package br.com.alura.alugames.principal

import br.com.alura.alugames.data.Database
import br.com.alura.alugames.data.jogo.JogosDAO
import br.com.alura.alugames.modelo.Jogo

fun main() {
    val manager = Database.getEntityManager()
    val jogoDao = JogosDAO(manager)

    val game = Jogo(
        "The Last of Us Part I",
        "https://cdn.cloudflare.steamstatic.com/steam/apps/1888930/header.jpg?t=1686864554",
        5.99,
        "Uma aventura pós-apocalíptica de sobrevivência em um mundo infestado por zumbis e facções em conflito."
    )
    val game2 = Jogo(
        "Dandara",
        "https://cdn.cloudflare.steamstatic.com/steam/apps/612390/header.jpg?t=1674055293",
        9.99,
        "Um jogo de plataforma e ação com elementos de metroidvania, onde você controla a heroína Dandara em sua luta para libertar um mundo repleto de opressão e tirania."
    )
    val jogoRecuperado = jogoDao.recuperarPeloId(3)
    println(jogoRecuperado)
    jogoDao.remove(4)

    val listOfGames: List<Jogo> = jogoDao.getList()
    println(listOfGames)


    manager.close()
}