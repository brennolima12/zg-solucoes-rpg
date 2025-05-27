package personagens;

import itens.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sandubinha extends Personagem {
    private Pergaminho pergaminho;
    private PlacaDePedra placaDePedra;
    private Estilingue estilingue;
    private Capa capa;
    private Colar colar;
    private EspadaZG espadaZG;
    private List<Item> inventario = new ArrayList<>();

    public void adicionarItem(Item item) {
        inventario.add(item);
    }

    public List<Item> getInventario(){
        return inventario;
    }

    public void removerItens(List<Item> itens) {
        inventario.removeAll(itens);
    }

    public void mostrarInventario() {
        if (inventario.isEmpty()) {
            System.out.println("Seu inventário está vazio");
        } else {
            for (Item item : inventario) {
                System.out.println("• " + item.getNome());
                System.out.println("Efeito positivo: " + item.getEfeitoPositivo());
                System.out.println("Efeito negativo: " + item.getEfeitoNegativo());
            }
        }
        System.out.println();
    }

    public Pergaminho getPergaminho() {
        return pergaminho;
    }

    public void setPergaminho(Pergaminho pergaminho) {
        this.pergaminho = pergaminho;
    }

    public PlacaDePedra getPlacaDePedra() {
        return placaDePedra;
    }

    public void setPlacaDePedra(PlacaDePedra placaDePedra) {
        this.placaDePedra = placaDePedra;
    }

    public Estilingue getEstilingue() {
        return estilingue;
    }

    public void setEstilingue(Estilingue estilingue) {
        this.estilingue = estilingue;
    }

    public Capa getCapa() {
        return capa;
    }

    public void setCapa(Capa capa) {
        this.capa = capa;
    }

    public Colar getColar() {
        return colar;
    }

    public void setColar(Colar colar) {
        this.colar = colar;
    }

    public EspadaZG getEspadaZG() {
        return espadaZG;
    }

    public void setEspadaZG(EspadaZG espadaZG) {
        this.espadaZG = espadaZG;
    }
    public Sandubinha(int vida, int vidaInicial) {
        super(vida, sortearNumeroSecreto(vida), vidaInicial);
    }

    private static int sortearNumeroSecreto(int vidaTotal) {
        Random numeroSecreto = new Random();
        return numeroSecreto.nextInt(vidaTotal) + 1;
    }
    public void perdeuVida(Inimigo inimigo) {
        if (inimigo.getNumeroSorteado() == this.getNumeroSecreto()) {
            int novaVida = this.getVida() - inimigo.getNumeroSorteado();
            this.setVida(novaVida);
        }
    }
}
