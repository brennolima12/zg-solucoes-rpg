package itens;

public class EspadaZG extends Item {
    private boolean SandubinhaUsandoEspadaZG = false;

    public EspadaZG(String name) {
        super(name,
                "Sorteia 40 números de uma só vez a cada ataque, O dano que o monstro recebe é a soma da quantidade de números secretos que aparecem no conjunto de 40 números sorteados",
                "Sem consequências para o uso");
    }
    public void ativarEspadaZG() {
        this.SandubinhaUsandoEspadaZG = true;
    }

    public boolean statusEspadaZG() {
        return SandubinhaUsandoEspadaZG;
    }
}
