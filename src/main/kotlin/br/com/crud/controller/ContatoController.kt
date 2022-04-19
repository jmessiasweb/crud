package br.com.crud.controller

import br.com.crud.model.Contato
import br.com.crud.service.serviceimpl.ContatoServiceImpl
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.*

@Controller(value = "/contato")
class ContatoController(private val contatoService: ContatoServiceImpl) {

        @Post
        fun criarContato(@Body contato: Contato ): HttpResponse<Contato>{
            return HttpResponse.created(contatoService.criarContato(contato))
        }

        @Get
        fun listaTodosContatos(): HttpResponse<List<Contato>>{
            return HttpResponse.ok(contatoService.buscaContatos())
        }

        @Delete("/{id}")
        fun deleteContato(@PathVariable id: Long) {
            contatoService.deletaContato(id)

        }

        @Put("/{id}")
        fun atualizaContato(@PathVariable id: Long, @Body contato: Contato): HttpResponse<Contato> {
         return HttpResponse.created( contatoService.atualizaContato(id, contato))


        }


}