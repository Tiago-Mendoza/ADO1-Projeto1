package jogo.personagens;

import jogo.defesas.DefesaHibrida;

public class Dragao extends Inimigo {
    public Dragao() {
        super("Dragão de Fogo", 1000, 150, new DefesaHibrida(20, 10));
    }

    @Override
    public void fraseApresentacao() {
        System.out.println("Transformarei você em cinzas!");
    }

    @Override
    public void fraseMorte() {
        System.out.println("Como... um simples mortal...");
    }
}
