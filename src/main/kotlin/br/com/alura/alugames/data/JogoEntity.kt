package br.com.alura.alugames.data

import javax.persistence.*

@Entity
@Table(name = "jogos")
data class JogoEntity(
    val titulo: String = "Título do jogo",
    val capa: String = "Capa do jogo" ,
    val preco: Double = 0.0,
    val descricao: String = "Descricao do jogo",
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int = 0
)
