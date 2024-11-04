package com.example.teste

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.teste.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Usando funções Kotlin e exibição no TextView
        val mensagem = getMensagemPersonalizada("Usuário")
        binding.textView.text = mensagem // Acessando o TextView via Data Binding
    }

    // Função que demonstra o uso de String Templates e Interpolação
    private fun getMensagemPersonalizada(nome: String): String {
        return "Bem-vindo(a), $nome! Este é um exemplo de Kotlin básico no Android."
    }
}