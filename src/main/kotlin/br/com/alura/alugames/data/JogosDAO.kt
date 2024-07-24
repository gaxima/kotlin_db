package br.com.alura.alugames.data

import br.com.alura.alugames.modelo.Jogo

class JogosDAO {

    fun getGames(): List<Jogo> {
        val manager = Database.getEntityManager()
        try {
            val query = manager.createQuery("FROM JogoEntity", JogoEntity::class.java)
            return query.resultList.map {
                it -> Jogo(it.titulo, it.capa, it.preco, it.descricao, it.id)
            }
        } finally {
            manager.close()
        }
    }

//    fun getGames(): List<Jogo> {
//
//        val gameList = mutableListOf<Jogo>()
//        val connection = getConnection()
//
//        if (connection != null) {
//            try {
//                val statement = connection.createStatement()
//                val result = statement.executeQuery("SELECT * FROM JOGOS")
//
//                while (result.next()) {
//                    val id = result.getInt("id")
//                    val titulo = result.getString("titulo")
//                    val capa = result.getString("capa")
//                    val descricao = result.getString("descricao")
//                    val preco = result.getDouble("preco")
//
//                    val game = Jogo(titulo, capa, preco, descricao, id)
//                    gameList.add(game)
//                }
//                statement.close()
//            } finally {
//                connection.close()
//            }
//        }
//        return gameList
//    }
//
//    fun addGame(game: Jogo) {
//        val connection = getConnection()
//        val insert = "INSERT INTO JOGOS (TITULO, CAPA, PRECO, DESCRICAO) VALUES (?, ?, ?, ?)"
//        if (connection != null) {
//            try {
//                val statement = connection.prepareStatement(insert)
//                statement.setString(1, game.titulo)
//                statement.setString(2, game.capa)
//                statement.setDouble(3, game.preco)
//                statement.setString(4, game.descricao)
//
//                statement.executeUpdate()
//                statement.close()
//            } finally {
//                connection.close()
//            }
//        }
//    }


}