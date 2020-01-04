/*       UNESP Câmpus de Presidente Prudente
         SECOMPP - Semana da Computação 2019
       Minicurso:  Desenvolvimento de Jogos 2D

   Exemplo 4: Naves - Desenvolvido por CyberGamba
   Adaptado para Java por: Luiz F. P. Redondaro    */

package Classes;

import jplay.Keyboard;
import jplay.Sprite;
import jplay.Window;

public class Jogador extends Sprite {
    
    //variáveis do jogador
    private static int pontos; //pontuação do jogador
    private double velocidade = 0.1;
    
    private Keyboard teclado; //capturar teclas
    
    public Jogador() {
        super("src//Imagens//nave.png", 1);
        x = 300;
        y = 400;
        pontos = 0;
    }
    
    public void mover(Window janela) {
        if (teclado == null)
            teclado = janela.getKeyboard();
        
        //movimentação do jogador
        if (teclado.keyDown(Keyboard.LEFT_KEY)) {
            if (x > 0)
                x -= velocidade;
        }
        if(teclado.keyDown(Keyboard.RIGHT_KEY)){
            if (x < 585)
                x += velocidade;
        }
        if (teclado.keyDown(Keyboard.UP_KEY)) {
            if (y > 45)
                y -= velocidade;
        }
        if(teclado.keyDown(Keyboard.DOWN_KEY)){
            if (y < 400)
                y += velocidade;
        }
    }
    
    public boolean disparou(Window janela) {
        if (teclado == null)
            teclado = janela.getKeyboard();
        
        return teclado.keyDown(Keyboard.SPACE_KEY);
    }
    
    public int getPontos() {
        return pontos;
    }
    
    public void pontuar() {
        pontos += 10;
    }
}
