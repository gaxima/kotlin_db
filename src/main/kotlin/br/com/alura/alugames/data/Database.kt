package br.com.alura.alugames.data

import br.com.alura.alugames.modelo.Jogo
import java.sql.Connection
import java.sql.DriverManager
import java.sql.SQLException


object Database {
    fun getConnection(): Connection? {
        return try {
            DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "rm87285", "260402")
        } catch (e: SQLException) {
            e.printStackTrace()
            null
        }
    }

    fun getGames(): List<Jogo> {

        val gameList = mutableListOf<Jogo>()
        val connection = getConnection()

        if (connection != null) {
            try {
                val statement = connection.createStatement()
                val result = statement.executeQuery("SELECT * FROM JOGOS")

                while (result.next()) {
                    val id = result.getInt("id")
                    val titulo = result.getString("titulo")
                    val capa = result.getString("capa")
                    val descricao = result.getString("descricao")
                    val preco = result.getDouble("preco")

                    val game = Jogo(titulo, capa, preco, descricao, id)
                    gameList.add(game)
                }
                statement.close()
            } finally {
                connection.close()
            }
        }
        return gameList
    }
}