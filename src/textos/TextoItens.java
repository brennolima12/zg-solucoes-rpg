package textos;

import itens.*;
import personagens.Sandubinha;

public class TextoItens {

    public static void entregarPergaminho(Sandubinha sandubinha) {
        Pergaminho pergaminho = new Pergaminho("Guia do Atendimento");
        sandubinha.adicionarItem(pergaminho);
        sandubinha.setPergaminho(pergaminho);
    }

    public static void entregarPlacaDePedra(Sandubinha sandubinha) {
        PlacaDePedra placaDePedra = new PlacaDePedra("Faturamentus");
        sandubinha.adicionarItem(placaDePedra);
        sandubinha.setPlacaDePedra(placaDePedra);
    }

    public static void entregarEstilingue(Sandubinha sandubinha) {
        Estilingue estilingue = new Estilingue("Estilingue mágico");
        sandubinha.adicionarItem(estilingue);
        sandubinha.setEstilingue(estilingue);
    }

    public static void entregarCapa(Sandubinha sandubinha) {
        Capa capa = new Capa("Azah Transmissão");
        sandubinha.adicionarItem(capa);
        sandubinha.setCapa(capa);
    }

    public static void entregarColar(Sandubinha sandubinha) {
        Colar colar = new Colar("Colar da estátua sagrada");
        sandubinha.adicionarItem(colar);
        sandubinha.setColar(colar);
    }

    public static void entregarEspadaZG(Sandubinha sandubinha) {
        EspadaZG espadaZG = new EspadaZG("Espada ZG");
        sandubinha.adicionarItem(espadaZG);
        sandubinha.setEspadaZG(espadaZG);
    }
}