package br.com.alura.alugames.principal

import br.com.alura.alugames.data.Database
import br.com.alura.alugames.data.aluguel.AluguelDAO
import br.com.alura.alugames.data.gamer.GamerDAO
import br.com.alura.alugames.data.jogo.JogosDAO
import br.com.alura.alugames.modelo.Periodo


fun main() {

    val manager = Database.getEntityManager()
    val aluguelDAO = AluguelDAO(manager)
    val jogoDAO = JogosDAO(manager)
    val gamerDAO = GamerDAO(manager)

    val gamer = gamerDAO.recuperarPeloId(4)
    val jogo = jogoDAO.recuperarPeloId(2)
    val aluguel = gamer.alugaJogo(jogo, Periodo())

    aluguelDAO.add(aluguel)

    val listaAluguel = aluguelDAO.getList()
    println(listaAluguel)

    manager.close()
}