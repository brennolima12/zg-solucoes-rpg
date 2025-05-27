package itens;

public class Pergaminho extends Item {
    private boolean SandubinhaUsandoPergaminho = false;

    public Pergaminho(String name) {
        super(name,
                "Sorteia 2 números de uma vez a cada ataque",
                "Sem efeitos negativos");
    }

    public void ativarPergaminho() {
        this.SandubinhaUsandoPergaminho = true;
    }

    public void desativarPergaminho() {
        this.SandubinhaUsandoPergaminho = false;
    }

    public boolean statusPergaminho() {
        return SandubinhaUsandoPergaminho;
    }


}