package jogo.personagens;

import jogo.defesas.Escudo;

public class Goblin extends Inimigo {
    public Goblin() {
        super("Goblin Verde", 300, 40, new Escudo(5));
    }

    @Override
    public void fraseApresentacao() {
        System.out.println("Hehehe! Mais um humano para minha coleção!");
    }

    @Override
    public void fraseMorte() {
        System.out.println("Grah... meu tesouro...");
    }
}
