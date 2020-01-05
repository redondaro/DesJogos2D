# Desenvolvimento de Jogos 2D
Minicurso que apresentei na SECOMPP (Semana da Computação de Presidente Prudente) na UNESP em 2019.

## Introdução - O que é um jogo 2D?
Os elementos de um jogo 2D são exibidos na matriz de pixels da tela, localizados pelas respectivas coordenadas (x,y). É semelhante ao plano cartesiano, mas com o eixo y invertido. As posições dos pixels variam de 0 a (tamanho da tela - 1).

![](/imagens/figura01.png)

As figuras são posicionadas pelo canto superior esquerdo (estrelado de amarelo).


## Resoluções de tela
Resolução é o tamanho em X e Y na matriz de pixels da tela.

![](/imagens/figura02.png)

O jogo pode ser exibido:
- em tela cheia, usando todos os pixels da tela
- em uma janela, de tamanho menor e diferente da tela


## FPS - Frames per Second
O jogo possui um loop infinito, que apaga e desenha a tela do jogo sucessivamente, mantendo a exibição atualizada. FPS é a quantidade de vezes essa atualização ocorre em um segundo.

![](/imagens/figura03.png)


## Categorias de jogos
Existem muitas categorias de jogos, que variam conforme os elementos do jogo são representados. Vamos conhecer as 4 mais populares.

### Plataforma
O personagem se movimenta livremente para a esquerda e direita, podendo subir ou descer em superfícies. 
Na figura abaixo, da esquerda para a direita: Sonic The Hedgehog (Mega Drive), Sunset Riders (Arcade), Contra Hard Corps (Mega Drive) e Alex Kidd in Miracle World (Master System).

![](/imagens/figura04.png)

### Nave (shooter)
Uma nave se movimenta na parte visível da tela, enquanto os demais elementos do jogo se movimentam na horizontal ou vertical. 
Na figura abaixo, da esquerda para a direita: Gradius III (Super Nintendo), R-Type (Super Nintendo), Astro Warrior (Master System) e Sonic Wings (Super Nintendo).

![](/imagens/figura05.png)

### Luta (1 contra 1)
Dois personagens lutando entre si, podendo se movimentar para a esquerda ou direita em um plano reto. 
As ações dos personagens são diversificadas e complexas, necessitando tratar as entradas do jogador para formar movimentos e golpes específicos. 
Na figura abaixo, da esquerda para a direita: Super Street Fighter 2 (Arcade), Killer Instinct (Arcade), The King of Fighters 97 (Arcade) e Mortal Kombat II (Arcade).

![](/imagens/figura06.png)

### Beat 'em up (briga de rua)
Jogo de luta, no qual o personagem do jogador enfrenta vários adversários simultaneamente. 
Além de esquerda/direita, os personagens se movimentam no cenário pelo plano vertical.
Na figura abaixo, da esquerda para a direita: Golden Axe (Arcade), Streets of Rage (Mega Drive), Cadillacs and Dinosaurs (Arcade) e Maximum Carnage (Super Nintendo).

![](/imagens/figura07.png)


## Curiosidades

### VENCEDORES NÃO USAM DROGAS!
![](/imagens/figura08.png)

Os arcades fabricados nos Estados Unidos exibiam um slogan anti-drogas quando a máquina era ligada. De fato, drogas não te fazem bem e não te tornam um cara legal... NÃO USEM!

### CyberGamba
Agradeço ao CyberGamba, o ilustre anônimo da internet que fez o primeiro tutorial de criação de jogos que tive contato. 
Embora eu ainda não tenha criado nenhum jogo, foram excelentes os seus tutoriais, e parte desse minicurso é baseada [nele](/outros_tutoriais/CYBERGAMBA_CRIE_SEUS_JOGOS.PDF). 

![](/imagens/figura09.png)

Em 2003, ficou famoso por criar o jogo Street Chaves (figura abaixo), uma paródia de Street Fighter, The King of Fighters e similares. 

![](/imagens/figura10.png)

Usava Delphi 5, uma linguagem pascal orientada a objetos, com a biblioteca DelphiX, e desenvolveu vários outros jogos com personagens do Chaves. 
Na figura abaixo, da esquerda para a direita: Madruga from Mars, Super Magro World, Madruga Goes Home e Madruga Craft. Esses e vários outros jogos são encontrados para [download](https://sites.google.com/site/cybergamba/arquivos).

![](/imagens/figura11.png)

CyberGamba também criou o jogo "Fainou Faiti - Vilelas Edition" (figura abaixo), no estilo Final Fight com ele e seus amigos sendo os personagens (ver figura abaixo).

![](/imagens/figura12.png)

Apesar da fama, se manteve no anonimato por medo de processos, pois embora os seus jogos fossem freeware, sem lhe render dinheiro, os jogos do Chaves não são autorizados. 

Além dos jogos, CyberGamba fez uma página com tutoriais, ensinando a criar jogos em DelphiX. Como eu disse anteriormente, serviu de base para este, e está disponível em [pdf](/outros_tutoriais/CYBERGAMBA_CRIE_SEUS_JOGOS.PDF).

![](/imagens/figura13.png)

Em 2010, anunciou o protótipo de um jogo...

![](/imagens/figura14.png)

Para quem temia processos por causa dos jogos do Chaves, imagine anunciar um jogo "Corrupto Fighter" com o ~bandido~ então presidente Lula sendo um dos personagens. 
Conspirações à parte, CyberGamba desapareceu da internet após essa publicação!!! ![](/imagens/figura15.png)


## Voltando ao desenvolvimento de jogos...
Algoritmo genérico de um jogo:
```
carregar(); //arquivos de imagens, sons, ...
iniciar();  //definir posições e estado de elementos, personagens, ...
enquanto (verdade) {     //loop infinito do jogo
    apaga_tela();
    atualiza_dinamica(); //ler entradas e atualizar dinâmica do jogo
    desenha_tela();      //desenhar cenário, objetos e personagens
}
```

### Ferramentas que utilizaremos nesse minicurso

![](/imagens/figura16.png)

![](/imagens/figura17.png)Java não é uma linguagem apropriada para o desenvolvimento de jogos, mas é simples e objetiva, perfeita para estudarmos os conceitos do curso.

### Programação Orientada a Objetos (POO)
Trata sistemas de software como um conjunto de componentes que interagem entre si para resolver um problema. 
Java e as linguagens modernas são orientadas a objetos.

![](/imagens/figura18.png)

- Classe: um elemento do sistema
- Atributos: dados do objeto
- Métodos: ações de um objeto, equivalente a funções

Possui conceitos: herança, associação, encapsulamento, abstração e polimorfismo. 

Como não é o foco do minicurso, e também não quero torná-lo mais complicado, não abordaremos esse assunto.

### JPlay
Biblioteca desenvolvida na UFRJ para a criação de jogos em Java. 
Possui várias classes, sendo as principais:

- Window: janela onde o jogo será exibido
- Keyboard: interpreta as entradas do jogador
- Sprite: imagem
- Sound: som

### Criando um novo projeto no NetBeans
1. Abra o NetBeans
2. Arquivo → Novo projeto
3. Aplicação Java → Próximo → Finalizar
No NetBeans 11, após etapa 2., escolha “Java with Ant”

![](/imagens/figura19.png)

Assim, um novo projeto é criado. A função "public static void main (String[] args)" é a função principal, que será executada.

![](/imagens/figura20.png)

### Adicionando a biblioteca JPlay no novo projeto
1. Baixe a biblioteca [JPlay.jar](/baixar/JPlay.jar)
2. Botão direito em Bibliotecas → Adicionar JAR/Pasta...
3. Adicione o arquivo JPlay.jar

![](/imagens/figura21.png)


## Exemplo 1: Capturar entradas e movimentar objeto na tela

Vamos criar uma janela de 640x480. Nela, será desenhado apenas um quadrado de tamanho 22x22. O quadrado estará no centro da janela e poderá ser movido com as setas de direção ←, →, ↑ e ↓.

![](/imagens/figura22.png)

- Baixe o arquivo [quadrado.png](/baixar/quadrado.png)
- Copie para o pacote dentro da pasta do projeto (ou do modo mais fácil, arraste com o mouse)

![](/imagens/figura23.png)

As figuras ficarão nas pastas do projeto, que por padrão do NetBeans são: 

Linux: /home/**<nome_usuário>**/NetBeansProjects/NomeProjeto/src/Pacote/ 

Windows: .../**<nome_usuário>**/Documentos/NetBeansProjects/NomeProjeto/src/Pacote/ 

### Código a ser adicionado na função main


```
    public static void main(String[] args) {

        Window janela = new Window(640,480);     //janela principal
        Keyboard teclado = janela.getKeyboard(); //capturar teclas
        
        Sprite quadrado = new Sprite("src//exemplo1//quadrado.png“, 1);
        quadrado.x = 308;   quadrado.y = 228;

        while (true) {                  //loop infinito
            janela.clear(Color.black);  //apagar tela

            if (teclado.keyDown(Keyboard.UP_KEY))       quadrado.y -= 0.2;
            if (teclado.keyDown(Keyboard.DOWN_KEY))     quadrado.y += 0.2;
            if (teclado.keyDown(Keyboard.LEFT_KEY))     quadrado.x -= 0.2;
            if (teclado.keyDown(Keyboard.RIGHT_KEY))    quadrado.x += 0.2;

            if (teclado.keyDown(Keyboard.ESCAPE_KEY))	System.exit(0);

            quadrado.draw();        //desenhar quadrado
            janela.update();        //atualizar janela
        }
    }
```

Algumas classes ficarão sublinhadas de vermelho, pois não estão definidos os caminhos destas.

![](/imagens/figura24.png)

Para resolver isso, abaixo da declaração "package <nome_do_pacote>;", adicione:

```
import java.awt.Color;
import jplay.Keyboard;
import jplay.Sprite;
import jplay.Window;
```

Estando tudo certo, aperte F6 para executar o código. 

Para evitar que o objeto saia da tela, adicione limites, substituindo esse trecho

```
            if (teclado.keyDown(Keyboard.UP_KEY))       quadrado.y -= 0.2;
            if (teclado.keyDown(Keyboard.DOWN_KEY))     quadrado.y += 0.2;
            if (teclado.keyDown(Keyboard.LEFT_KEY))     quadrado.x -= 0.2;
            if (teclado.keyDown(Keyboard.RIGHT_KEY))    quadrado.x += 0.2;
```

por esse

```
            if (teclado.keyDown(Keyboard.UP_KEY))
                if (quadrado.y > 0)
                    quadrado.y -= 0.2;
            if (teclado.keyDown(Keyboard.DOWN_KEY))
                if (quadrado.y < 454)
                    quadrado.y += 0.2;
            if (teclado.keyDown(Keyboard.LEFT_KEY))
                if (quadrado.x > 0)
                    quadrado.x -= 0.2;
            if (teclado.keyDown(Keyboard.RIGHT_KEY))
                if (quadrado.x < 616)
                    quadrado.x += 0.2;
```

## Colisões
É um dos elementos mais importantes do jogo, que ocorre quando elementos do jogo se encostam. Cada elemento possui uma área que pode colidir com a área de outros elementos, conhecida como *hitbox*.

Nos exemplos abaixo, cada elemento que pode colidir está com sua hitbox contornada de alguma cor. Nele, a nave vermelha colide com o disparo da nave azul e o monstro colide com a mão do personagem. Observe que no segundo exemplo o personagem também colide com a parte de cima de uma plataforma, que o impede de cair.

![](/imagens/figura25.png)

Se um dos pontos de A estiver dentro de B (ou vice-versa), ocorre a colisão, conforme a figura abaixo. Nela, A1 ≤ B1 ≤ A2 no eixo X e A1 ≤ B1 ≤ A3 no eixo Y. Na prática, o jogo reconhece a colisão quando os elementos se encostam.

![](/imagens/figura26.png)

### Tipos de colisões
Existem várias possibilidades de implementações, sendo 3 tipos os mais comuns.

#### Colisão por imagem
A hitbox é constituída pela área da figura dos elementos/personagens. Pela sua simplicidade, é a implementação mais comum, sendo usada pela biblioteca JPlay. Possui a desvantagem de gerar falsas colisões, como na segunda figura abaixo, na qual os dois personagens colidem na área vazia.

![](/imagens/figura27.png)

#### Colisão por área
Cada elemento possui áreas de contato definidas, sem relação com a área das figuras/quadros. Podem existir mais de uma área de contato para cada personagem ou elemento (exemplo abaixo). Alternativa eficiente para as falsas colisões ocorridas na implementação por imagem.

![](/imagens/figura28.png)

#### Colisão por sprite
Somente considera o contato das áreas não transparentes da figura/quadro (figura abaixo). Alternativa mais sofisticada, por considerar as colisões que de fato ocorreram. O custo computacional é maior que nas outras alternativas.

![](/imagens/figura29.png)

## Exemplo 2 - Colisões

...
