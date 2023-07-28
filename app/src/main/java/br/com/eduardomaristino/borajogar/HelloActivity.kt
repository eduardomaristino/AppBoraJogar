package br.com.eduardomaristino.borajogar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.lang.Math.random

class HelloActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello)

        // Obtendo referência dos componentes
        val txvHelloSaudacao : TextView = findViewById(R.id.txvHelloSaudacoes)
        val btnHelloAvancar : Button = findViewById(R.id.btnHelloAvancar)

        // Definindo lista de saudações
        val saudacoes = arrayListOf<String>("E ai, vamos jogar?",
            "O que vai ser, verdade ou consequência!?",
            "Agora o jogo vai começar!",
        "Reuna os migos e vamos nos divertir!",
            "Agora a diversão vai começar!",
        "Preparado pra jogar?",
        "Bora responder tooodas!",
        "A diversão não acaba nunca!",
        "Opa, bora jogar?",
        "Esse jogo vai hitar!",
        "Já estão todos prontxs!?",
        "Vamo zerar a vida com esse jogo!",
        "Pronto pro play!?",
        "Entrou!? Agora tem que hitar!",
        "O jogo só acaba se app bugar!",
        "Preparadxs?",
        "O que acontecer aqui, fica aqui!")

        // Imprimindo saudações
        //(saudacoes.random())

        // Exibindo no Text View
        txvHelloSaudacao.text = saudacoes.random().toString()


        // Definindo listener do botão AVANÇAR
        btnHelloAvancar.setOnClickListener {

            // Abrir tela START
            val myIntent = Intent(this, StartActivity::class.java)
            startActivity(myIntent)

            // Finalizando telas anteriores
            finishAffinity()

        }

    }
}