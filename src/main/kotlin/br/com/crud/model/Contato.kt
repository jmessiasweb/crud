package br.com.crud.model


import javax.persistence.*

@Entity
data class Contato (

    @Id
    @field:GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long,
    var telefone: String,
    @Column(name = "nome_de_contato")
    var nomeDeContato: String

        )
