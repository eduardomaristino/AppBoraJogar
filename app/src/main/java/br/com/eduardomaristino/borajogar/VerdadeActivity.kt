package br.com.eduardomaristino.borajogar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class VerdadeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verdade)

        // Mapeando os ID'S
        val txvVerdadeFrases : TextView = findViewById(R.id.txvVerdadeFrases)
        val btnVerdadeVoltar : Button = findViewById(R.id.btnVerdadeVoltar)

        // Mostrando verdades aleatórias
        val verdades = arrayListOf<String>("Qual a razão mais ridícula pelo qual você terminou com alguém?",
        "Qual é a mania mais nojenta que você tem?",
        "Fale alguma coisa que tem no seu histórico de navegação que você ficaria constrangido se alguém visse.",
        "Fale uma pessoa não famosa de quem você tem inveja.",
        "O que você faria se estivesse com dor de barriga e tivesse que fazer cocô em um banheiro público, mas acabasse o papel higiênico?",
        "Qual a coisa mais embaraçosa que você já fez bêbado?",
        "Qual é o seu maior prazer secreto?",
        "Qual foi a coisa mais embaraçosa que você já fez?",
        "Qual foi a coisa mais ilegal que você já fez?",
        "Qual foi a pessoa mais aleatória que você já stalkeou nas redes sociais?",
        "Qual foi a última coisa que você pesquisou no seu telefone?",
        "Qual foi o pior presente que você já deu para alguém?",
        "Quando foi a última vez que você chorou e por quê?",
        "Quantos dias você já passou sem tomar banho?",
        "Você já fez xixi nas calças depois de adulto?",
        "Você já traiu algum namorado ou namorada?",
        "Conte uma coisa que você espera que seus pais nunca descubram.",
        "Qual é o apelido mais vergonhoso que alguém já lhe deu?",
        "Qual foi o sonho mais assustador que você já teve?",
        "Quem você acha que é a pessoa mais bonita aqui?",
        "Se você tivesse que beijar um dos jogadores, quem seria?",
        "Conte algo infantil que você ainda faz.",
        "Qual é o seu medo mais sombrio?",
        "Com que pessoa você se arrepende profundamente de já ter se envolvido?",
        "Qual a coisa mais estranha ou vergonhosa que você já fez por dinheiro?",
        "Você já fez cocô nas calças em público?",
        "Se você pudesse mudar de vida com uma celebridade por um dia, quem seria?",
        "Qual a maior mentira que você já contou para alguém da sua família?",
        "O que a maioria das pessoas pensa que é verdade sobre você, mas não é?",
        "Qual foi a maior conquista que você já teve?",
        "O que você faria se fosse do sexo oposto por uma semana?",
        "Qual foi o momento mais inapropriado em que você peidou?",
        "Você já se arrependeu imediatamente após enviar uma mensagem? Qual?",
        "Por que você terminou com seu último namorado ou namorada?",
        "Qual a foto mais constrangedora que você tem no seu telefone?")

        // Exibindo o TextView
        txvVerdadeFrases.text = verdades.random().toString()

        // Listener do botão VOLTAR
        btnVerdadeVoltar.setOnClickListener {

            // Abrir tela START
            val myIntent = Intent(this, MainActivity::class.java)
            startActivity(myIntent)

            // Finalizando telas anteriores
            finishAffinity()

        }

    }
}