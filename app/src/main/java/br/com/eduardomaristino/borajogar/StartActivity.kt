package br.com.eduardomaristino.borajogar

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class StartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        // Obtendo a referência dos componenetes
        val edtStartPlayer1 : EditText = findViewById(R.id.edtStartPlayer1)
        val edtStartPlayer2 : EditText = findViewById(R.id.edtStartPlayer2)
        val edtStartPlayer3 : EditText = findViewById(R.id.edtStartPlayer3)
        val edtStartPlayer4 : EditText = findViewById(R.id.edtStartPlayer4)
        val btnStartAvancar : Button = findViewById(R.id.btnStartJogar)

        // Listener do botão JOGAR
        btnStartAvancar.setOnClickListener {

            // Obtendo os dados inseridos pelo usuário
            val jogador1 = edtStartPlayer1.text.toString().trim()
            val jogador2 = edtStartPlayer2.text.toString().trim()
            val jogador3 = edtStartPlayer3.text.toString().trim()
            val jogador4 = edtStartPlayer4.text.toString().trim()

            // Validação dos campos
            if (jogador1.isEmpty() || jogador2.isEmpty() || jogador3.isEmpty() || jogador4.isEmpty()) {

                // Exibindo mensagem de erro com Toast
                Toast.makeText(this, "Nomeie todos os jogadores", Toast.LENGTH_SHORT).show()
            }
            else {
                // Todos os campos foram preenchidos

                // Criando ou acessando um arquivo SharedPreferences (TALVEZ NÃO SEJA NECESSÁRIO)
               val sharedPreferences = getSharedPreferences("jogador1_$jogador1", Context.MODE_PRIVATE)

                // Criando uma referência para o editor de arquivo (TAVELZ NÃO SEJA NECESSÁRIO)
               val editPreferences = sharedPreferences.edit()

                // Definindo alterações mo arquivo
                editPreferences.putString("JOGADOR 1", jogador1)
                editPreferences.putString("JOGADOR 2", jogador2)
                editPreferences.putString("JOGADOR 3", jogador3)
                editPreferences.putString("JOGADOR 4", jogador4)

                // Chamando método
                editPreferences.commit()

                // Salvando as alterações no arquivo SharedPreferences
                editPreferences.apply()

                // Abrir a tela Main
                val myIntent = Intent(this, MainActivity::class.java)

                // Passando os dados de uma Activity para a outra utilizando a intent
                myIntent.putExtra("INTENT_JOGADOR1", jogador1)

                startActivity(myIntent)

                // Encerrando as telas anteriores
                finishAffinity()

            }

        }

    }
}