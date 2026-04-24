package jogo.batalha;

import jogo.personagens.Jogador;
import jogo.personagens.Inimigo;

public class Batalha {
    private String vencedor;
    private String inimigoNome;

    public boolean processar(Jogador jogador, Inimigo inimigo) {
        this.inimigoNome = inimigo.getNome();
        System.out.println("--- INICIO DA BATALHA: " + jogador.getNome() + " VS " + inimigo.getNome() + " ---");
        inimigo.fraseApresentacao();

        while (jogador.estaVivo() && inimigo.estaVivo()) {
            jogador.mostraVida();
            inimigo.mostraVida();
            
            jogador.fazAtaque(inimigo);
            if (inimigo.estaVivo()) {
                inimigo.fazAtaque(jogador);
            }
            System.out.println("--------------------");
        }

        if (jogador.estaVivo()) {
            inimigo.fraseMorte();
            vencedor = jogador.getNome();
            return true;
        } else {
            jogador.fraseMorte();
            vencedor = inimigo.getNome();
            return false;
        }
    }

    public String getResultado() {
        return "Confronto contra " + inimigoNome + " | Vencedor: " + vencedor;
    }
}
