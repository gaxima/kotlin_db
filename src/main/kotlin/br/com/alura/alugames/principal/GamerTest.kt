package br.com.alura.alugames.principal

import br.com.alura.alugames.data.Database
import br.com.alura.alugames.data.gamer.GamerDAO
import br.com.alura.alugames.data.plano.PlanoDAO
import br.com.alura.alugames.modelo.Gamer

fun main() {

    val gamer = Gamer(
        "Rafa",
        "rafa@email.com",
        "15/07/2002",
        "rafagamer"
    )
    val manager = Database.getEntityManager()
    val gamerDao = GamerDAO(manager)
    val planosDao = PlanoDAO(manager)

    gamer.plano = planosDao.recuperarPeloId(id = 3)


    gamerDao.add(gamer)
    val listaGamer = gamerDao.getList()
    println(listaGamer)
    manager.close()

}