package br.com.eduardomaristino.borajogar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ConsequenciaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_consequencia)

        // Mapeando as ID'S
        val txvConsequenciaFrases : TextView = findViewById(R.id.txtConsequenciaFrases)
        val btnConsequenciaVoltar : Button = findViewById(R.id.btnConsequenciaVoltar)

        // Mostrando consequências aleatórias
        // Mostrando verdades aleatórias
        val consequencias = arrayListOf<String>("Tente fazer malabarismos com 3 objetos que o grupo escolher.",
        "Tente beber um copo de água (ou cerveja, caso tenha) usando os seus pés.",
        "Publique uma foto sua embaraçosa no seu Instagram.",
        "Molhe o rosto e passe farinha nele.",
        "Ligue para um amigo e diga que está grávida ou que vai ser pai.",
        "Ligue para uma lanchonete ou pizzaria e tente desabafar com o atendente, dizendo que seu namorada (o) terminou contigo.",
        "Ligue para sua mãe chorando dizendo que quer sua chupeta.",
        "Ligue para o quinto contato no seu telefone e cante um trecho de uma música que o grupo escolher.",
        "Invente um rap sobre sua situação amorosa atual.",
        "Finja ser um gato e se esfregue em todas as pessoas do grupo.",
        "Finja ser o animal de estimação da pessoa à sua esquerda.",
        "Finja que você é um peixe se debatendo fora d’água.",
        "Finja que você está parindo uma criança.",
        "Fale com um sotaque diferente pelo resto do jogo.",
        "Faça uma serenata para alguém do grupo.",
        "Faça uma mímica descrevendo seu filme favorito para que o grupo adivinhe.",
        "Faça uma maquiagem em si mesmo usando itens e condimentos da cozinha.",
        "Faça uma apresentação de dança do ventre.",
        "Faça o quadradinho de oito (ou tente)",
        "aça lip sync (dublagem) de alguma música que o grupo escolher.",
        "Deixe que alguém te dê um tapa na cara.",
        "Deixe que alguém do grupo envie uma foto que ele escolher para algum contato.",
        "Deixe o grupo te colocar em uma posição embaraçosa e tire uma foto.",
        "Deixe alguém depilar uma parte do seu corpo.",
        "Dance alguma música que o grupo escolher.",
        "Coma uma colher cheia de pimenta ou molho picante.",
        "Coloque um cubo de gelo nas suas calças.",
        "Cheire as axilas da pessoa a sua direita.",
        "Cante uma música de funk como se fosse uma ópera.",
        "Beba um shot de alguma bebida alcoólica e depois gire por 30 segundos (somente para maiores de idade).",
        "Beba alguma mistura que o grupo irá fazer.",
        "A pessoa terá que lamber o rosto de todas as pessoas do mesmo gênero que ela do círculo.",
        "Alguém do grupo irá escrever algo embaraçoso no seu corpo com uma caneta permanente.",
        "Se enrole em papel higiênico até ficar parecido com uma múmia.",
        "Saia de casa ou vá na sua varanda e grite bem alto “eu ainda amo meu ex”.",
        "Ligue para um restaurante e tente manter o atendente em linha por cinco minutos, imitando um gringo falando português.")

        // Exibindo o TextView
        txvConsequenciaFrases.text = consequencias.random().toString()

        // Listener do botão VOLTAR
        btnConsequenciaVoltar.setOnClickListener {

            // Abrir tela START
            val myIntent = Intent(this, MainActivity::class.java)
            startActivity(myIntent)

            // Finalizando telas anteriores
            finishAffinity()

        }
    }
}