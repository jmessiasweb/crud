package br.com.crud.service

import br.com.crud.model.Contato

interface ContatoService {
    fun criarContato(contato: Contato): Contato

    fun buscaContatos(): List<Contato>

    fun deletaContato(id: Long)

    fun atualizaContato(id: Long, contato: Contato): Contato

}