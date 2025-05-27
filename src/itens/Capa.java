package itens;

public class Capa extends Item {
    private boolean SandubinhaUsandoCapa = false;

    public Capa(String nome) {
        super(nome,
                "Personagem pode sortear +10 números por rodada. O dano causado ao inimigo é a quantidade de vezes que o número secreto do inimigo aparece nesses sorteios.",
                "Se errar o número secreto, o personagem sofrerá dano proporcional ao último número sorteado na rodada.");
    }

    public void ativarCapa() {
        this.SandubinhaUsandoCapa = true;
    }

    public void desativarCapa() {
        this.SandubinhaUsandoCapa = false;
    }

    public boolean statusCapa() {
        return SandubinhaUsandoCapa;
    }
}
