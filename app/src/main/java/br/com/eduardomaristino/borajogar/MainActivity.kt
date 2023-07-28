package br.com.eduardomaristino.borajogar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Obtendo a referência dos IDs
        val txvMainEscolha: TextView = findViewById(R.id.txvMainEscolha)
        val btnMainVerdade: Button = findViewById(R.id.btnMainVerdade)
        val btnMainConsequencia: Button = findViewById(R.id.btnMainConsequencia)

        // Listener botão VERDADE
        btnMainVerdade.setOnClickListener {
            // Abrindo tela VERDADES
            val myIntent = Intent(this, VerdadeActivity::class.java)
            startActivity(myIntent)
        }

        // Listener botão CONSEQUÊNCIA
        btnMainConsequencia.setOnClickListener {
            // Abrindo tela CONSEQUÊNCIA
            val myIntent = Intent(this, ConsequenciaActivity::class.java)
            startActivity(myIntent)
        }

        /* CONSIDERAÇÕES FINAIS!
        1. Na tela main onde tem escrito "AGORA", esta palavra era pra ser o nome do jogador da rodada, porém não houve tempo para
        que eu conseguisse achar uma solução.
        2. A proposta usada como referência foi a "Biscoito da Sorte", que foi reformulada para um game de verdade ou consequência,
        com frases de saudação aleatórias.
        3. O game não está 100% como queria, pois não consegui fazer a nomeação dos jogadores por rodada(Cada rodada era pra exibir
        o nome de um dos jogadores, em ordem cadastrada na tela Start, por exemplo: Eguardo, escolha uma das opções.)
        4. Usei o código desenvolvido durante as aulas como base.
        5. A parte onde obtive mais dificuldade foi conseguir que as frases fossem exibidas de forma aleatória na TextView, de resto
        foi tranquilo.
        %. Agradeço ao professor Raul pelo conhecimento repassado!

         */
    }
}
