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

Os arcades fabricados nos Estados Unidos exibiam um slogan anti-drogas quando a máquina era ligada. De fato, drogas não te fazem bem e não te fazem um cara legal... NÃO USEM!

### CyberGamba
Agradeço ao CyberGamba, o ilustre anônimo da internet que fez o primeiro tutorial de criação de jogos que tive contato. 
Embora eu ainda não tenha criado nenhum jogo, foram excelentes os seus tutoriais, e parte desse minicurso é baseada nele. 

![](/imagens/figura09.png)

Em 2003, ficou famoso por criar o jogo Street Chaves (figura abaixo), uma paródia de Street Fighter, The King of Fighters e similares. 

![](/imagens/figura10.png)

Usava Delphi 5, uma linguagem pascal orientada a objetos, com a biblioteca DelphiX, e desenvolveu vários outros jogos com personagens do Chaves. 
Na figura abaixo, da esquerda para a direita: Madruga from Mars, Super Magro World, Madruga Goes Home e Madruga Craft.

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

Assim, um novo projeto é criado.

![](/imagens/figura20.png)

### Adicionando a biblioteca JPlay no novo projeto
1. Baixe a biblioteca [JPlay.jar](/baixar/JPlay.jar)
2. Botão direito em Bibliotecas → Adicionar JAR/Pasta...
3. Adicione o arquivo JPlay.jar

![](/imagens/figura21.png)

## Exemplo 1: Capturar entradas e movimentar objeto na tela

...
