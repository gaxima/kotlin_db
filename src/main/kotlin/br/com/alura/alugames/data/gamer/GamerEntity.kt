package br.com.alura.alugames.data.gamer

import br.com.alura.alugames.data.plano.PlanoAvulsoEntity
import br.com.alura.alugames.data.plano.PlanoEntity
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.ManyToOne
import javax.persistence.Table

@Entity
@Table(name = "Gamer")
data class GamerEntity(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int = 0,
    val nome: String = "Nome do gamer",
    val email: String = "email@email.com",
    val dataNascimento: String? = null,
    val usuario: String? = null,
    @ManyToOne
    val plano: PlanoEntity = PlanoAvulsoEntity()
)