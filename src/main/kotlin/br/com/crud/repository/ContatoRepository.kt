package br.com.crud.repository

import br.com.crud.model.Contato
import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository

@Repository
interface ContatoRepository: JpaRepository<Contato, Long> {

    fun findContatoById(id: Long): Contato

}