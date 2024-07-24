package br.com.alura.alugames.data.gamer

import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "Gamer")
data class GamerEntity(
    val nome: String = "Nome do gamer",
    val email: String = "Email do gamer",
    val dataNascimento: String,
) {
}