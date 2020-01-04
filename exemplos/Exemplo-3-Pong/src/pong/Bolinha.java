/*       UNESP Câmpus de Presidente Prudente
         SECOMPP - Semana da Computação 2019
       Minicurso:  Desenvolvimento de Jogos 2D

   Exemplo 3: Pong - Desenvolvido por CyberGamba
   Adaptado para Java por: Luiz F. P. Redondaro  */

package pong;

import jplay.Sprite;

public class Bolinha extends Sprite {
    
    //variáveis para a bolinha
    private double velocidade, //velocidade da bolinha
                   dirX, //direção da bolinha no eixo X
                   dirY; //direção da bolinha no eixo Y
    
    public Bolinha() {
        super("src//imagens//bolinha.png", 1);
        
        velocidade = 0.2;
        dirX = 1;
        dirY = -1;
        x = 30;   //posição em x
        y = 250;  //posição em y
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
    
    public void acertou() {
        dirX = 1;
        velocidade += 0.1;
    }
    
}
