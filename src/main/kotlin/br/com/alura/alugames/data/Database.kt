package br.com.alura.alugames.data


import javax.persistence.EntityManager
import javax.persistence.EntityManagerFactory
import javax.persistence.Persistence


object Database {
    //    fun getConnection(): Connection? {
//        return try {
//            DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "rm87285", "260402")
//        } catch (e: SQLException) {
//            e.printStackTrace()
//            null
//        }
//    }
    fun getEntityManager(): EntityManager {
        val factory: EntityManagerFactory = Persistence.createEntityManagerFactory("RM87285")
        return factory.createEntityManager()
    }

}