/*       UNESP Câmpus de Presidente Prudente
         SECOMPP - Semana da Computação 2019
       Minicurso:  Desenvolvimento de Jogos 2D

   Exemplo 2: Colisões - por Luiz Fernando Perez Redondaro */

package exemplo2;

import jplay.Sprite;

public class Bolinha extends Sprite {
    
    public Bolinha() {
        super("src//exemplo2//bolinha.png", 1);
        x = 100;
        y = 228;
    }
    
    public void acertou() {
        if (x == 100) {
            x = 308;
            y = 380;
        }else
            if (x == 500){
                x = 308;
                y = 100;
            }else
                if (y == 100) {
                    x = 100;
                    y = 228;
                }else{ //y == 500
                    x = 500;
                    y = 228;
                }
    }
    
}
