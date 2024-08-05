package br.com.alura.alugames.principal

import br.com.alura.alugames.data.Database
import br.com.alura.alugames.data.gamer.GamerDAO
import br.com.alura.alugames.data.plano.PlanoDAO
import br.com.alura.alugames.modelo.Gamer

fun main() {

    val gamer = Gamer(
        "helena",
        "hele@email.com",
        "01/09/1996",
        "helegamer",
    )
    val manager = Database.getEntityManager()
    val gamerDao = GamerDAO(manager)
    val planosDao = PlanoDAO(manager)
    gamer.plano = planosDao.recuperarPeloId(5)


    gamerDao.add(gamer)
    val listaGamer = gamerDao.getList()
    println(listaGamer)
    manager.close()

}