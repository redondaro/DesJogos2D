# Desenvolvimento de Jogos 2D
Minicurso que apresentei na SECOMPP (Semana da Computação de Presidente Prudente) da UNESP em 2019.

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
Embora eu ainda não tenha criado nenhum jogo, os seus tutoriais me foram excelentes, e parte desse minicurso é baseada [nele](/outros_tutoriais/CYBERGAMBA_CRIE_SEUS_JOGOS.PDF). 

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
    package exemplo1; //LEIA OBSERVAÇÃO!!!
    
    public static void main(String[] args) {

        Window janela = new Window(640,480);     //janela principal
        Keyboard teclado = janela.getKeyboard(); //capturar teclas
        
        Sprite quadrado = new Sprite("src//exemplo1//quadrado.png“, 1); //LEIA OBSERVAÇÃO!!!
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

__OBSERVAÇÃO: exemplo1 é o nome do pacote (equivalente a uma pasta) do projeto, conforme figura do tópico anterior. Nesse e nos demais exemplos, exemplo1 será usado no import inicial de cada pacote e no endereço da figura a ser carregada, devendo ser substituído pelo nome usado em seu projeto.__ 

Algumas classes ficarão sublinhadas de vermelho, pois não estão definidos os caminhos destas.

![](/imagens/figura24.png)

Para resolver isso, abaixo da declaração "package exemplo1;", adicione:

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

No projeto do exemplo anterior, será acrescida uma bolinha. Cada vez que o quadrado encostar nela (colidir), mudará de posição.

![](/imagens/figura30.png)

- Baixe o arquivo [bolinha.png](/baixar/bolinha.png)
- Copie para o pacote dentro da pasta do projeto (ou do modo mais fácil, arraste com o mouse)

![](/imagens/figura31.png)

- Botão direito do mouse no pacote, Novo → Classe Java...
- Em nome, coloque “Bolinha”

![](/imagens/figura32.png)

### Adicione o código na classe Bolinha.java

```
package exemplo1;

import jplay.Sprite;

public class Bolinha extends Sprite {

    public Bolinha() {       //construtor
        super("src//exemplo1//bolinha.png", 1);
        x = 100;    y = 228;
    }
    
    public void acertou() {  //mudar posição da bolinha
        if (x == 100) {
            x = 308;    y = 380;
        }else
            if (x == 500){
                x = 308;    y = 100;
            }else
                if (y == 100) {
                    x = 100;    y = 228;
                }else{  //y == 500
                    x = 500;    y = 228;
                }
    }
}
```

### Adicione os trechos destacados nas respectivas partes do código da main

```
        ...

        Sprite quadrado = new Sprite("src//exemplo1//quadrado.png“, 1);
        quadrado.x = 308;   quadrado.y = 228;

        //insira essa linha acima do início do loop infinito
        Bolinha bolinha = new Bolinha();

        while (true) {  //loop infinito

        ...

            if (teclado.keyDown(Keyboard.ESCAPE_KEY))	System.exit(0);

            // insira essas 3 linhas abaixo entre a linha acima e a linha que desenha o quadrado
            if (quadrado.collided(bolinha)) //verificar colisão
                bolinha.acertou();
            bolinha.draw();    //desenhar bolinha

            quadrado.draw();   //desenhar quadrado
            janela.update();   //atualizar janela

        ...
```

## Exemplo 3 - Pong - Autor CyberGamba
Esse exemplo foi desenvolvido em Delphi por CyberGamba, sendo que eu apenas o adaptei para Java. 
Nele, são exibidos: o placar do jogador, uma raquete (retângulo azul) controlada pelo jogador, uma bolinha amarela que se movimenta pelas diagonais e as paredes (superior, inferior e direita) que colidem com a bolinha. 
O movimento da raquete é controlada com as setas do teclado (cima e baixo), e a tecla ESC encerra o jogo. 
A bolinha começa movimentando no sentido superior direito, refletindo a direção quando colide com uma parede. 
Se a bolinha passar do limite esquerdo, terá passado pela raquete, o jogador perde e o jogo reinicia.

![](/imagens/figura33.png)

- Baixe e salve os arquivos: [horizontal.png](/baixar/horizontal.png), [vertical.png](/baixar/vertical.png) e [raquete.png](/baixar/raquete.png)
- Copie-os para o pacote do projeto (igual nos exemplos 1 e 2)
- Crie as novas classes: Paredes e Raquete

O arquivo “quadrado.png” pode ser excluído do pacote do projeto

![](/imagens/figura34.png)

### O código para a classe Raquete.java

```
package exemplo1;

import jplay.Keyboard;
import jplay.Sprite;
import jplay.Window;

public class Raquete extends Sprite {
    private Keyboard teclado; //capturar teclas

    public Raquete() {
        super("src//exemplo1//raquete.png", 1);
        x = 5;    y = 210;
    }
    
    public void mover(Window janela) {
        teclado = janela.getKeyboard();

        if (teclado.getKeyDown(Keyboard.UP_KEY))
            if (y > 40)
                y -= 0.3;

        if (teclado.getKeyDown(Keyboard.DOWN_KEY))
            if (y < 405)
                y += 0.3;
    }
}
```

### O código para a classe Paredes.java
```
package exemplo1;

import jplay.Sprite;

public class Paredes {
    Sprite topo, baixo, direita;

    public Paredes() {
        topo = new Sprite("src//exemplo1//horizontal.png", 1);
        baixo = new Sprite("src//exemplo1//horizontal.png", 1);
        direita = new Sprite("src//exemplo1//vertical.png", 1);

        topo.x = baixo.x = 0;
        topo.y = 31;
        baixo.y = 470;
        direita.x = 632;
        direita.y = 34;
    }
    
    public void draw() {
        topo.draw();
        baixo.draw();
        direita.draw();
    }

    //colisões
    public boolean colidiuTopo(Sprite bolinha) {
        if (topo.collided(bolinha))
            return true;
        return false;
    }
    public boolean colidiuBaixo(Sprite bolinha) {
        if (baixo.collided(bolinha))
            return true;
        return false;
    }
    public boolean colidiuDireita(Sprite bolinha) {
        if (direita.collided(bolinha))
            return true;
        return false;
    }
}
```

### Mudar o código da classe Bolinha.java para
```
package exemplo1;

import jplay.Sprite;

public class Bolinha extends Sprite {

    private double velocidade, //velocidade da bolinha
                   dirX, //direção da bolinha no eixo X
                   dirY; //direção da bolinha no eixo Y

    public Bolinha() {
        super("src//exemplo1//bolinha.png", 1);
        velocidade = 0.2;
        dirX = 1; dirY = -1;
        x = 30;    y = 250;
    }
    
    public void acertou() {
        dirX = 1;
        velocidade += 0.1;
    }

    public void mover(Paredes parede) {
        x = x + (dirX*velocidade);
        y = y + (dirY*velocidade);
        
        //verificar colisões da bola com as paredes
        if (parede.colidiuDireita(this))
            dirX = -1;
        if (parede.colidiuTopo(this))
            dirY = 1;
        else
            if (parede.colidiuBaixo(this))
                dirY = -1;
    }
    
    public int getDirecao() {
        if (dirX < 0)
            return -1;
        else
            return 1;
    }
}
```

### A classe que possui a função main deverá ficar:

```
package exemplo1;

import java.awt.Font;
import java.awt.Color;
import jplay.Keyboard;
import jplay.Sound;
import jplay.Window;

public class Main {

    private static int pontos;       //pontuação do jogador
    private static Raquete raquete;  //raquete do jogador
    private static Bolinha bolinha;  //bolinha
    private static Paredes paredes;  //paredes
    
    private static void iniciar() {  // re/iniciar jogo
        pontos = 0;
        bolinha = new Bolinha();
        raquete = new Raquete();
        paredes = new Paredes();
    }

    public static void main(String[] args) {
        Window janela = new Window(640,480);     //janela principal
        Keyboard teclado = janela.getKeyboard(); //capturar teclas
        iniciar();
        
        while (true) {                 //loop infinito
            janela.clear(Color.black); //apagar tela

            janela.drawText("PONG", 20, 20, Color.white, new Font("Default",0, 14));
            janela.drawText("Pontos: " + pontos, 320, 20, Color.white, new Font("Default",0, 14));

            raquete.mover(janela);    //movimentar os objetos
            bolinha.mover(paredes);

            if (raquete.collided(bolinha) && bolinha.getDirecao() < 0) {
                bolinha.acertou();    pontos += 10;
            }else
                if (bolinha.x < -20)  //se bolinha saiu da tela
                    iniciar();

            paredes.draw(); bolinha.draw(); raquete.draw();  //exibir objetos
            janela.update();          //atualizar janela

            if (teclado.keyDown(Keyboard.ESCAPE_KEY))	System.exit(0);
        }   
    }
}
```

### Adicionar efeitos sonoros
Baixe e salve os arquivos: [click.wav](/baixar/click.wav) e [explode.wav](/baixar/explode.wav), e coloque-os na pasta do projeto. Em seguida, encontre os trechos em que a bolinha colide e sai da tela no código da main, e adicione os trechos:

```
            bolinha.mover(paredes);

            if (raquete.collided(bolinha) && bolinha.getDirecao() < 0) {
                bolinha.acertou();    pontos += 10;

                new Sound("src//exemplo1//click.wav").play(); //som de acerto

            }else
                if (bolinha.x < -20) { //se bolinha saiu da tela
                    iniciar();

                    new Sound("src//exemplo1//explode.wav").play(); //som de erro

                }
            paredes.draw();    bolinha.draw();    raquete.draw();  //exibir objetos
```

## Outros conceitos
Alguns elementos presentes nos jogos 2D, os quais terão apenas os seus conceitos básicos explicados, de modo a não acrescentar complexidade e dificuldade de entendimento nesse minicurso.

### Mapa de objetos
É o mapeamento dos elementos de cada cenário do jogo: plataformas, itens e várias outras coisas que podem interagir com o personagem do jogador, podendo também apresentar elementos decorativos (que não possuem interação), posição inicial do jogador e inimigos. 
Ao iniciar o jogo, todos os elementos são montados conforme o mapa de objetos para o cenário que será exibido. 
O mapa de objetos pode ser implementado de diversas formas, sendo mais comum um arquivo de imagem em que cada pixel representa um determinado elemento. 
Na figura abaixo, temos: no canto superior esquerdo está o arquivo png aberto em um editor de imagens, abaixo os objetos do cenário (item, nuvem, ...), à direita o arquivo pgm aberto em um editor de texto, e na parte de baixo, o cenário gerado.

![](/imagens/figura35.png)

### Câmera
Em cenários maiores que a tela, deve-se tratar a posição do personagem, elementos do cenário e inimigos,  o personagem seja exibido no centro da tela, como se tivesse uma câmera o acompanhando enquanto percorre o cenário. 

![](/imagens/figura36.png)

Deve-se desenhar na tela apenas os elementos que são visíveis na câmera, de modo a otimizar o desempenho do computador na execução do jogo. Imagine um cenário 100 vezes maior que o da figura acima, e quanto o jogo pode ficar mais "pesado" tratando todos os elementos desenhados, ao invés de apenas os visíveis.


### Personagens

Possuem várias características, que deverão possuir variáveis para armazenar e tratar.
- Estado: parado, andando, abaixado, etc
- Ciclo: passo 1, passo 2, ...
- Imagem do personagem para cada ciclo

![](/imagens/figura37.png)

Como na figura acima, cada imagem deve possuir seu inverso, completando as ações do jogador para qualquer direção (esquerda ou direita).


### FPS (Frames per Second)
Da forma que até então implementamos (abaixo), o jogo será executado na velocidade máxima suportada pelo processador. A velocidade de execução será diferente de uma máquina para outra. Ou seja, __essa implementação não é adequada!__

```
enquanto (verdade) {
    apaga_tela();
    atualiza_mecanica();
    exibe_saída();
}
```

__Solução:__ levando em conta que o computador trata o tempo em milissegundos e que ele deve atualizar o jogo N vezes por segundo, procuramos um intervalo I, que é dado pela fórmula: I = 1000 ÷ N 

Exemplo: para obter uma taxa de ...


## Outros exemplos em JPlay

Exemplo 4 - Nave - Autor CyberGamba 
Outro exemplo que foi desenvolvido em Delphi por CyberGamba, sendo que eu apenas adaptei para Java. 
- Possui elementos principais de um jogo: jogador e inimigos
- Os inimigos são destruídos quando colidem com o disparo do jogador
- Jogador é destruído ao colidir com um inimigo e jogo reinicia
- Movimentos pelas setas do teclado, espaço atira e ESC sai do jogo

![](/imagens/figura38.png) 


Exemplo 5 - Alex Kidd
...

![](/imagens/figura39.png)


## Referências

...
