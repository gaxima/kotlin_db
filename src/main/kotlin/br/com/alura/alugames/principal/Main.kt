package br.com.alura.alugames.principal


import javax.persistence.EntityManager
import javax.persistence.EntityManagerFactory
import javax.persistence.Persistence

fun main() {
    val emf: EntityManagerFactory = Persistence.createEntityManagerFactory("alugames")
    val em: EntityManager = emf.createEntityManager()

    em.transaction.begin()

    // Limpe o cache do EntityManager
    em.clear()

    em.transaction.commit()
    em.close()
    emf.close()
}


//fun main() {
//    val leitura = Scanner(System.`in`)
//    val gamer = Gamer.criarGamer(leitura)
//    println("Cadastro concluído com sucesso. Dados do gamer:")
//    println(gamer)
//    println("Idade do gamer: " + gamer.dataNascimento?.tranformarEmIdade())
//
//    do {
//        println("Digite um código de jogo para buscar:")
//        val busca = leitura.nextLine()
//
//        val buscaApi = ConsumoApi()
//        val informacaoJogo = buscaApi.buscaJogo(busca)
//
//
//        var meuJogo: Jogo? = null
//
//        val resultado = runCatching {
//            meuJogo = Jogo(
//                informacaoJogo.info.title,
//                informacaoJogo.info.thumb
//            )
//        }
//
//        resultado.onFailure {
//            println("Jogo inexistente. Tente outro id.")
//        }
//
//        resultado.onSuccess {
//            println("Deseja inserir uma descrição personalizada? S/N")
//            val opcao = leitura.nextLine()
//            if (opcao.equals("s", true)) {
//                println("Insira a descrição personalizado para o jogo:")
//                val descricaoPersonalizada = leitura.nextLine()
//                meuJogo?.descricao = descricaoPersonalizada
//            } else {
//                meuJogo?.descricao = meuJogo?.titulo
//
//            }
//
//            gamer.jogosBuscados.add(meuJogo)
//        }
//
//        println("Deseja buscar um novo jogo? S/N")
//        val resposta = leitura.nextLine()
//
//    } while (resposta.equals("s", true))
//
//    println("Jogos buscados:")
//    println(gamer.jogosBuscados)
//
//    println("\n Jogos ordenados por título: ")
//    gamer.jogosBuscados.sortBy {
//        it?.titulo
//    }
//
//    gamer.jogosBuscados.forEach {
//        println("Título: " + it?.titulo)
//    }
//
//    val jogosFiltrados = gamer.jogosBuscados.filter {
//        it?.titulo?.contains("batman", true) ?: false
//    }
//    println("\n Jogos filtrados: ")
//    println(jogosFiltrados)
//
//    println("Deseja excluir algum jogo da lista original? S/N")
//    val opcao = leitura.nextLine()
//    if (opcao.equals("s", true)) {
//        println(gamer.jogosBuscados)
//        println("\nInforme a posição do jogo que deseja excluir: ")
//        val posicao =leitura.nextInt()
//        gamer.jogosBuscados.removeAt(posicao)
//    }
//
//    println("\n Lista atualizada:")
//    println(gamer.jogosBuscados)
//
//    println("Busca finalizada com sucesso.")
//
//}