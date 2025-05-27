package itens;

public class Colar extends Item {
    private boolean SandubinhaUsandoColar = false;

    public Colar(String nome) {
        super(nome,
                "Direito a sortear +10 números de uma só vez a cada ataque.",
                "É subtraído 3 de vida do personagem sempre que o colar é utilizado em uma rodada de batalha.");
    }

    public void ativarColar() {
        this.SandubinhaUsandoColar = true;
    }

    public void desativarColar() {
        this.SandubinhaUsandoColar = false;
    }

    public boolean statusColar() {
        return SandubinhaUsandoColar;
    }

}
