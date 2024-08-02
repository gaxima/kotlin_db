package br.com.alura.alugames.principal

import br.com.alura.alugames.data.Database
import br.com.alura.alugames.data.plano.PlanoDAO
import br.com.alura.alugames.modelo.PlanoAssinatura
import br.com.alura.alugames.modelo.PlanoAvulso

fun main(){
//    val avulso = PlanoAvulso("BRONZE")
//    val prata = PlanoAssinatura("PRATA", 9.90, 3, 0.15)
//    val ouro = PlanoAssinatura("OURO", 19.90, 5, 0.20)
//    val platina = PlanoAssinatura("PLATINA", 29.90, 10, 0.30)
//    val diamante = PlanoAssinatura("DIAMANTE", 49.90, 20, 0.50)
//
    val manager = Database.getEntityManager()
    val planosDAO = PlanoDAO(manager)

//    planosDAO.add(avulso)
//    planosDAO.add(prata)
//    planosDAO.add(ouro)
//    planosDAO.add(platina)
//    planosDAO.add(diamante)

    val listaPlanos = planosDAO.getList()
    println(listaPlanos)
    manager.close()
}