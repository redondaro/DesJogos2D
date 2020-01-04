/*       UNESP Câmpus de Presidente Prudente
         SECOMPP - Semana da Computação 2019
       Minicurso:  Desenvolvimento de Jogos 2D

   Exemplo 3: Pong - Desenvolvido por CyberGamba
   Adaptado para Java por: Luiz F. P. Redondaro  */

package pong;

import jplay.Sprite;

public class Paredes {
    
    Sprite topo, baixo, direita;
    
    public Paredes() {
        
        //carregar imagens
        topo = new Sprite("src//imagens//horizontal.png", 1);
        baixo = new Sprite("src//imagens//horizontal.png", 1);
        direita = new Sprite("src//imagens//vertical.png", 1);

        //coordenadas
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
