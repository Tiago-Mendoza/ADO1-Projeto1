package jogo.personagens;

import jogo.defesas.Esquiva;
import java.util.Random;

public class Espectro extends Inimigo {
    public Espectro() {
        super("Espectro Sombrio", 450, 80, new Esquiva(30));
    }

    @Override
    public void fazAtaque(Criatura alvo) {
        Random rd = new Random();
        int dano = this.getAtaque();
        
        if (rd.nextInt(100) < 20) {
            System.out.println("Corte Crítico do Espectro!");
            dano *= 2;
        }
        
        alvo.tomaDano(dano);
    }

    @Override
    public void fraseApresentacao() {
        System.out.println("O frio da morte está se aproximando...");
    }

    @Override
    public void fraseMorte() {
        System.out.println("Voltarei para as sombras...");
    }
}
