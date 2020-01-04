/*       UNESP Câmpus de Presidente Prudente
         SECOMPP - Semana da Computação 2019
       Minicurso:  Desenvolvimento de Jogos 2D

   Exemplo 3: Pong - Desenvolvido por CyberGamba
   Adaptado para Java por: Luiz F. P. Redondaro  */

package pong;

import java.awt.Font;
import java.awt.Color;
import jplay.Keyboard;
import jplay.Sound;
import jplay.Window;

public class Main {
    
    //elementos do jogo
    private static int pontos;      //pontuação do jogador
    private static Raquete raquete; //raquete do jogador
    private static Bolinha bolinha; //bolinha
    private static Paredes paredes; //paredes
    
    //re/iniciar jogo
    private static void iniciar() {
        pontos = 0;
        bolinha = new Bolinha();
        raquete = new Raquete();
        paredes = new Paredes();
    }

    public static void main(String[] args) {
        Window janela = new Window(640,480); //janela principal
        janela.setTitle("Exemplo 3 - Pong");
        Keyboard teclado = janela.getKeyboard(); //capturar teclas
        
        iniciar();
        
        while (true) { //loop infinito para executar o jogo
            
            janela.clear(Color.black);
            
            //exibir textos
            janela.drawText("PONG", 20, 20, Color.white, new Font("Default",0, 14));
            janela.drawText("Pontos: " + pontos, 320, 20, Color.white, new Font("Default",0, 14));
            
            //movimentar os objetos
            raquete.mover(janela);
            bolinha.mover(paredes);
            
            if (raquete.collided(bolinha) && bolinha.getDirecao() < 0) {
                bolinha.acertou();
                pontos += 10;
                new Sound("src//sons//click.wav").play(); //som de acerto
            }else
                if (bolinha.x < -20) { //se bolinha saiu da tela
                    new Sound("src//sons//explode.wav").play(); //som de erro
                    iniciar();
                }
            
            //exibir objetos
            paredes.draw();
            bolinha.draw();
            raquete.draw();
            
            janela.update(); //atualizar desenho na janela janela
            
            if (teclado.keyDown(Keyboard.ESCAPE_KEY)) //se apertar ESC, encerra o jogo
                System.exit(0);
        }
    }
    
}
