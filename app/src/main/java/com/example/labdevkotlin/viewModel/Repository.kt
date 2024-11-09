package com.example.labdevkotlin.viewModel

import com.example.labdevkotlin.roomDB.Pessoa
import com.example.labdevkotlin.roomDB.PessoaDataBase

class Repository(private val db : PessoaDataBase) {
    suspend fun upsertPessoa(pessoa: Pessoa){
        db.pessoaDao().upsertPessoa(pessoa)
    }

    suspend fun deletePessoa(pessoa: Pessoa){
        db.pessoaDao().deletePessoa(pessoa)
    }

    fun getAllPessoas() =  db.pessoaDao().getAllPessoas()
}