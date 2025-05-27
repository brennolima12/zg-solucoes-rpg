package personagens;

import java.util.Random;

public class Inimigo extends Personagem {
    private String name;

    public Inimigo(String name, int vida, int vidaInicial) {
        super(vida, sortearNumeroSecreto(vida), vidaInicial);
        this.name = name;
    }

    private static int sortearNumeroSecreto(int vidaTotal) {
        Random numeroSecreto = new Random();
        return numeroSecreto.nextInt(vidaTotal) + 1;
    }

    public void perdeuVida(Sandubinha sandubinha) {
        if (sandubinha.getPergaminho() != null && sandubinha.getPergaminho().statusPergaminho()) {
            perdeuVidaPergaminho(sandubinha);
        } else if (sandubinha.getPlacaDePedra() != null && sandubinha.getPlacaDePedra().statusPlacaDePedra()) {
            perdeuVidaPlaca(sandubinha);
        } else if (sandubinha.getEstilingue() != null && sandubinha.getEstilingue().statusEstilingue()) {
            perdeuVidaEstilingue(sandubinha);
        } else if (sandubinha.getCapa() != null && sandubinha.getCapa().statusCapa()) {
            perdeuVidaCapa(sandubinha);
        } else if (sandubinha.getColar() != null && sandubinha.getCapa().statusCapa()) {
            perdeuVidaColar(sandubinha);
        } else if (sandubinha.getEspadaZG() != null && sandubinha.getEspadaZG().statusEspadaZG()) {
            perdeuVidaEspadaZG(sandubinha);
        } else {
            if (sandubinha.getNumeroSorteado() == this.getNumeroSecreto()) {
                int acertos = 0;
                this.setVida(this.getVida() - sandubinha.getNumeroSorteado());
                System.out.println("Sabdubinha acertou o inimigo no ataque!");
                acertos++;
                System.out.println("Número secreto apareceu " + acertos + " vez/vezes.");
                System.out.println();
            }
        }
    }

    public void perdeuVidaPergaminho(Sandubinha sandubinha) {
        int acertos = 0;

        Random sorteio = new Random();
        for (int i = 0; i < 2; i++) {
            int sorteado = sorteio.nextInt(this.getVidaInicial()) + 1;
            System.out.println("Sorteio " + (i + 1) + " - Sandubinha sorteou " + sorteado + " usando o pergaminho");

            if (sorteado == this.getNumeroSecreto()) {
                this.setVida(Math.max(this.getVida() - sorteado, 0));
                acertos++;
            }
        }
        System.out.println("Número secreto apareceu " + acertos + " vez/vezes.");
        System.out.println();
    }

    public void perdeuVidaPlaca(Sandubinha sandubinha) {
        int acertos = 0;
        Random sorteio = new Random();
        for (int i = 0; i < 4; i++) {
            int sorteado = sorteio.nextInt(this.getVidaInicial()) + 1;
            System.out.println("Sorteio " + (i + 1) + " - Sandubinha sorteou " + sorteado + " usando a placa");

            if (sorteado == this.getNumeroSecreto()) {
                this.setVida(Math.max(this.getVida() - sorteado, 0));
                acertos++;
            }
        }
        System.out.println("Número secreto apareceu " + acertos + " vez/vezes.");
        System.out.println();
    }

    public void perdeuVidaEstilingue(Sandubinha sandubinha) {
        if (this.getVida() <= 0) return;
        Random sorteio = new Random();
        int acertos = 0;
        boolean acertoEstilingue = true;
        boolean acerto = false;
        int erros = sandubinha.getEstilingue().getErros();


        for (int i = 0; i < (this.getVida()/2) + 0.5 ; i++) {
            int sorteado = sorteio.nextInt(Math.max(this.getVidaInicial(), 1)) + 1;
            System.out.println("Sorteio " + (i + 1) + " - Sandubinha sorteou " + sorteado + " usando o estilingue");

            if (sorteado == this.getNumeroSecreto()) {
                acertos++;
                this.setVida(Math.max(this.getVida() - acertos * this.getNumeroSecreto(), 0));
                acertos = 0;
                acerto = true;
                acertoEstilingue = true;

            } else {
                sandubinha.getEstilingue().incrementarErros();
            }
        }
        if (acertoEstilingue){
            System.out.println("Acertou o número secreto!");
        }
        System.out.println();
        System.out.println();

        if (erros > 3) {
            sandubinha.setVida(Math.max(sandubinha.getVida() - 1, 0));
            System.out.println("3 erros! Sandubinha perde 1 de vida como penalidade.");
        } else {
            System.out.println("Sandubinha já errou " + erros + " vez(es) com o estilingue.");
        }

        if (acerto){
            perdeuVidaEstilingue(sandubinha);
            System.out.println("Sandubinha acertou, refazendo rodada!");
        }
    }


    public void perdeuVidaCapa(Sandubinha sandubinha) {
        Random sorteio = new Random();
        int acertos = 0;

        for (int i = 0; i < 10; i++) {

            int sorteado = sorteio.nextInt(getVidaInicial()) + 1;
            System.out.println("Sorteio " + (i + 1) + "- Sandubinha sorteou " + sorteado + " usando a capa");

            if (sorteado == this.getNumeroSecreto()) {
                acertos++;
                this.setVida(Math.max(this.getVida() - acertos * this.getNumeroSecreto(), 0));
                acertos = 0;
            }
        }
        System.out.println("Número secreto apareceu " + acertos + " vez/vezes.");
        System.out.println();


    }

    public void perdeuVidaColar(Sandubinha sandubinha) {
        Random sorteio = new Random();
        int acertos = 0;

        for (int i = 0; i < 10; i++) {
            int sorteado = sorteio.nextInt(this.getVidaInicial()) + 1;
            System.out.println("Sorteio: " + (i + 1) + " Sandubinha sorteou " + sorteado + " usando o colar");

            if (sorteado == this.getNumeroSecreto()) {
                this.setVida(Math.max(this.getVida() - sorteado, 0));
                acertos++;
            }
        }
        System.out.println("Número secreto apareceu " + acertos + " vez/vezes.");
        System.out.println();
        sandubinha.setVida(sandubinha.getVida() - 3);
        System.out.println("Sandubinha sofreu 3 de dano por utilizar o colar.");

    }

    private void perdeuVidaEspadaZG(Sandubinha sandubinha) {

        int acertos = 0;
        Random sorteio = new Random();

        System.out.println("Sandubinha ataca com a Espada ZG!");
        System.out.println("Sorteando 40 números entre 1 e " + getVidaInicial() + "...");

        for (int i = 0; i < 40; i++) {
            int sorteado = sorteio.nextInt(getVidaInicial()) + 1;
            System.out.println("Sorteio " + (i + 1) + " - Sandubinha sorteou " + sorteado + " usando a EspadaZG");
            if (sorteado == this.getNumeroSecreto()) {
                acertos++;
            }
        }

        int dano = acertos * this.getNumeroSecreto();
        System.out.println("Número secreto apareceu " + acertos + " vez/vezes.");
        System.out.println("Dano total causado pela Espada ZG: " + dano);
        this.setVida(Math.max(this.getVida() - dano, 0));
        System.out.println();
    }


    public String getName() {
        return name;
    }

}
