/*       UNESP Câmpus de Presidente Prudente
         SECOMPP - Semana da Computação 2019
       Minicurso:  Desenvolvimento de Jogos 2D

   Exemplo 4: Naves - Desenvolvido por CyberGamba
   Adaptado para Java por: Luiz F. P. Redondaro    */

package Classes;

import jplay.Sprite;

public class Inimigo extends Sprite {
    
    private boolean visivel; //se o inimigo está visível na tela
    private double velocidade = 0.1;
    
    public Inimigo() {
        super("src//Imagens//inimigo.png", 1);
        visivel = false;
    }
    public void mover() {
        y += velocidade;
        if (y > 480)
            visivel = false;
    }
    
    public void posiciona(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void setVisivel(double velocidade) {
        if (velocidade > 0.1)
            velocidade = 0.1;
        else
            if (velocidade < 0.05)
                velocidade = 0.05;
        this.visivel = true;
        this.velocidade = velocidade;
    }
    public void atingido() {
        visivel = false;
    }
    public boolean estaVisivel() {
        return visivel;
    }
    
}
