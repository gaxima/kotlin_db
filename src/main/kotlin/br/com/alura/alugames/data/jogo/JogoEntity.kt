package br.com.alura.alugames.data.jogo

import javax.persistence.*

@Entity
@Table(name = "jogos")
data class JogoEntity(
    val titulo: String = "Título do jogo",
    val capa: String = "Capa do jogo" ,
    val preco: Double = 0.0,
    val descricao: String? = null,
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int = 0
)
