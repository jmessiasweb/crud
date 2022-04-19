package br.com.crud.service.serviceimpl

import br.com.crud.model.Contato
import br.com.crud.repository.ContatoRepository
import br.com.crud.service.ContatoService
import jakarta.inject.Singleton

@Singleton
class ContatoServiceImpl(private val contatoRepository: ContatoRepository): ContatoService {
    override fun criarContato(contato: Contato): Contato {
      return contatoRepository.save(contato)
    }

    override fun buscaContatos(): List<Contato> {
        return contatoRepository.findAll()
    }

    override fun deletaContato(id: Long) {
        contatoRepository.deleteById(id)
    }

    override fun atualizaContato(id: Long, novoContato: Contato): Contato {
        var contato = contatoRepository.findContatoById(id)
        contato.apply {
            contato.telefone = novoContato.telefone
            contato.nomeDeContato = novoContato.nomeDeContato

        }
        return contatoRepository.update(contato)
    }

}