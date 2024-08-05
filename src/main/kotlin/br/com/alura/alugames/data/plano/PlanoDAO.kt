package br.com.alura.alugames.data.plano

import br.com.alura.alugames.data.DAO
import br.com.alura.alugames.modelo.Plano
import br.com.alura.alugames.utilitario.toEntity
import br.com.alura.alugames.utilitario.toModel
import javax.persistence.EntityManager

class PlanoDAO(
    manager: EntityManager
) : DAO<Plano, PlanoEntity>(
    manager, PlanoEntity::class.java
) {
    override fun toEntity(plano: Plano): PlanoEntity {
        return plano.toEntity()
    }

    override fun toModel(entity: PlanoEntity): Plano {
        return entity.toModel()
    }
}