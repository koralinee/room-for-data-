package com.example.labdevkotlin.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.example.labdevkotlin.roomDB.Pessoa
import kotlinx.coroutines.launch

class PessoaViewModel(private val repository : Repository):ViewModel() {

    fun getPessoa() = repository.getAllPessoas().asLiveData(viewModelScope.coroutineContext)

    fun upsertPessoa(pessoa: Pessoa){
        viewModelScope.launch {
            repository.upsertPessoa(pessoa)
        }
    }

    fun deletePessoa(pessoa : Pessoa) {
        viewModelScope.launch {
            repository.deletePessoa(pessoa)
        }
    }
}