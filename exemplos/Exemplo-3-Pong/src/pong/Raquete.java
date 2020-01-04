/*       UNESP Câmpus de Presidente Prudente
         SECOMPP - Semana da Computação 2019
       Minicurso:  Desenvolvimento de Jogos 2D

   Exemplo 3: Pong - Desenvolvido por CyberGamba
   Adaptado para Java por: Luiz F. P. Redondaro  */

package pong;

import jplay.Keyboard;
import jplay.Sprite;
import jplay.Window;

public class Raquete extends Sprite {
    
    private Keyboard teclado; //capturar teclas
    
    public Raquete() { //carregar figura e posição inicial da raquete
        super("src//imagens//raquete.png", 1);
        this.x = 5;
        this.y = 210;
    }
    
    public void mover(Window janela) { //mover raquete
        teclado = janela.getKeyboard();
        
        if (teclado.keyDown(Keyboard.UP_KEY)) {
            if (y > 40)
                y -= 0.3;
        }
        if(teclado.keyDown(Keyboard.DOWN_KEY)){
            if (y < 405)
                y += 0.3;
        }
    }
}
