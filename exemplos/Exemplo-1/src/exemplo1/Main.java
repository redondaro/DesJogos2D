/*       UNESP Câmpus de Presidente Prudente
         SECOMPP - Semana da Computação 2019
       Minicurso:  Desenvolvimento de Jogos 2D

   Exemplo 1: Movimentação - por Luiz Fernando Perez Redondaro */

package exemplo1;

import java.awt.Color;
import jplay.Keyboard;
import jplay.Sprite;
import jplay.Window;

public class Main {

    public static void main(String[] args) {
        
        Window janela = new Window(640,480); //janela principal
        janela.setTitle("Exemplo 1 - Movimentação");
        Keyboard teclado = janela.getKeyboard(); //capturar teclas
        
        //criar e inicializar quadrado
        Sprite quadrado = new Sprite("src//exemplo1//quadrado.png", 1);
        quadrado.x = 308;
        quadrado.y = 228;
        
        while (true) { //loop infinito para executar o jogo
            
            //movimentação do quadrado
            if (teclado.keyDown(Keyboard.UP_KEY))
                if (quadrado.y > 0)
                    quadrado.y -= 0.3;
            if(teclado.keyDown(Keyboard.DOWN_KEY))
                if (quadrado.y < 456)
                    quadrado.y += 0.3;
            if (teclado.keyDown(Keyboard.LEFT_KEY))
                if (quadrado.x > 0)
                    quadrado.x -= 0.3;
            if(teclado.keyDown(Keyboard.RIGHT_KEY))
                if (quadrado.x < 616)
                    quadrado.x += 0.3;
            
            janela.clear(Color.black); //apagar tela
            quadrado.draw(); //desenhar quadrado
            janela.update(); //atualizar desenho na janela janela
            
            if (teclado.keyDown(Keyboard.ESCAPE_KEY)) //se apertar ESC, encerra o jogo
                System.exit(0);
        }
    }
    
}
