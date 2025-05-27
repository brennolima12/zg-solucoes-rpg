package itens;

public class Estilingue extends Item {
    private boolean SandubinhaUsandoEstilingue = false;
    private int erros = 0;

    public Estilingue(String nome) {
        super(nome,
                "É capaz de atirar uma pedra teleguiada que acerta o alvo com 50% de chance",
                "Se errar 3 vezes, seguidas ou não, passa a subtrair 1 de vida do personagem quando usado");
    }

    public void ativarEstilingue() {
        this.SandubinhaUsandoEstilingue = true;
    }

    public void desativarEstilingue() {
        this.SandubinhaUsandoEstilingue = false;
    }

    public boolean statusEstilingue() {
        return SandubinhaUsandoEstilingue;
    }

    public int getErros() {
        return erros;
    }
    public void incrementarErros() {
        this.erros++;
    }
}

