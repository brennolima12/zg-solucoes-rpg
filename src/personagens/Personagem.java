package personagens;

import java.util.Random;

public class Personagem {
    private int vida;
    private int numeroSecreto;
    private int numeroSorteado;
    private int vidaInicial;

    public Personagem(int vida, int numeroSecreto, int vidaInicial) {
        this.vida = vida;
        this.numeroSecreto = numeroSecreto;
        this.vidaInicial = vidaInicial;
    }

    public int getVidaInicial() {
        return vidaInicial;
    }

    public void setVidaInicial(int vidaInicial) {
        this.vidaInicial = vidaInicial;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = Math.max(vida, 0);
    }

    public int getNumeroSecreto() {
        return numeroSecreto;
    }

    public void setNumeroSecreto(int numeroSecreto) {
        this.numeroSecreto = numeroSecreto;
    }

    public int getNumeroSorteado() {
        return numeroSorteado;
    }
    public void setNumeroSorteado(Personagem personagemAdversario) {
        Random numeroSorteadoPorRodada = new Random();
        this.numeroSorteado = numeroSorteadoPorRodada.nextInt(personagemAdversario.getVidaInicial()) + 1;
    }
}

