/*       UNESP Câmpus de Presidente Prudente
         SECOMPP - Semana da Computação 2019
       Minicurso:  Desenvolvimento de Jogos 2D

   Exemplo 4: Naves - Desenvolvido por CyberGamba
   Adaptado para Java por: Luiz F. P. Redondaro    */

package Classes;

import java.awt.Color;
import java.awt.Font;
import java.util.Random;
import jplay.Keyboard;
import jplay.Sound;
import jplay.Window;

public class Main {
    
    //elementos do jogo
    private final static int MAXINIMIGO = 4; //máximo de inimigos na tela
    private static Jogador jogador;
    private static Tiro tiro;
    private static Inimigo[] inimigo = new Inimigo[5];
    private static Random gerador; //gerador de números aleatórios
    
    //re/iniciar jogo
    private static void iniciar() {
        
        gerador = new Random(); //inicia gerador de números aleatórios
        
        //jogador e seu disparo
        jogador = new Jogador();
        tiro = new Tiro();
        
        //criar inimigos
        for (int i = 0; i < MAXINIMIGO; i++)
            inimigo[i] = new Inimigo();
    }
    
    public static void main(String[] args) {
        Window janela = new Window(640,480); //janela principal
        janela.setTitle("Shooter Vertical");
        
        iniciar();
        
        Keyboard teclado = janela.getKeyboard(); //capturar teclas
        
        while (true) { //loop infinito para executar o jogo
            
            janela.clear(Color.black); //apagar tela
            
            //exibir textos
            janela.drawText("Shooter Vertical", 20, 20, Color.white, new Font("Default",0, 14));
            janela.drawText("Pontos: " + jogador.getPontos(), 320, 20, Color.white, new Font("Default",0, 14));
            
            //atualizar movimentos do jogador e seu disparo
            jogador.mover(janela);
            if (jogador.disparou(janela))
                tiro.disparar(jogador.x + 10, jogador.y - 40);
            if (tiro.estaVisivel())
                tiro.mover();
            
            //atualizar inimigos na tela
            for (int i = 0; i < MAXINIMIGO; i++) {
                if (inimigo[i].estaVisivel())
                    inimigo[i].mover();
                else{
                    if (gerador.nextInt(1000) == 0) {
                        inimigo[i].posiciona(gerador.nextInt(585), -40);
                        inimigo[i].setVisivel(gerador.nextDouble() * 0.15);
                    }
                }
            }
            
            //verificar se o disparo acertou alguma nave
            for (int i = 0; i < MAXINIMIGO; i++)
                if (inimigo[i].estaVisivel()) {
                    if (tiro.estaVisivel() && inimigo[i].collided(tiro)) { //acertou uma nave

                        //ambos ficam invisíveis
                        tiro.atingiu();
                        inimigo[i].atingido();

                        jogador.pontuar(); //jogador ganha ponto
                        new Sound("src//Sons//explode.wav").play(); //som
                        break; //sai do loop
                    }else
                        if (jogador.collided(inimigo[i])) { //jogador morreu... :(
                            iniciar();
                            new Sound("src//Sons//explode.wav").play(); //som
                        }
                }
            
            //exibir elementos do jogo
            jogador.draw();         //jogador
            if (tiro.estaVisivel()) //disparo, se visível
                tiro.draw();
            for (int i = 0; i < MAXINIMIGO; i++)
                if (inimigo[i].estaVisivel()) //inimigos visíveis
                    inimigo[i].draw();
            
            janela.update(); //atualizar desenho na janela janela
            
            //se apertar ESC, encerra o jogo
            if (teclado.keyDown(Keyboard.ESCAPE_KEY))
                System.exit(0);
        }
    }
}
