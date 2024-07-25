package br.com.alura.alugames.principal

import br.com.alura.alugames.data.Database
import br.com.alura.alugames.data.gamer.GamerDAO
import br.com.alura.alugames.data.plano.PlanoDAO
import br.com.alura.alugames.modelo.Gamer

fun main() {

    val gamer3 = Gamer(
        "Barra",
        "barra@email.com",
        "26/04/2002",
        "barragamer"
    )
    val manager = Database.getEntityManager()
    val gamerDao = GamerDAO(manager)
    val planosDao = PlanoDAO(manager)

    gamer3.plano = planosDao.recuperarPeloId(id = 4)


    gamerDao.add(gamer3)
    val listaGamer = gamerDao.getList()
    println(listaGamer)
    manager.close()

}