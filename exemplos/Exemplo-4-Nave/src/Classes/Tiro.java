/*       UNESP Câmpus de Presidente Prudente
         SECOMPP - Semana da Computação 2019
       Minicurso:  Desenvolvimento de Jogos 2D

   Exemplo 4: Naves - Desenvolvido por CyberGamba
   Adaptado para Java por: Luiz F. P. Redondaro    */

package Classes;

import jplay.Sprite;

public class Tiro extends Sprite {
    
    private boolean visivel;
    private final double velocidade = 0.3;
    
    public Tiro() {
        super("src//Imagens//tiro.png");
        this.visivel = false;
    }
    
    public boolean estaVisivel() {
        return visivel;
    }
    
    public void disparar(double x, double y) {
        if (!visivel) {
            this.x = x;
            this.y = y;
            visivel = true;
        }
    }
    
    public void mover() {
        if (visivel) {
            y -= velocidade;
            if (y < 0)
                visivel = false;
        }
    }
    
    public void atingiu() {
        visivel = false;
    }
    
}
