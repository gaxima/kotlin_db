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

}