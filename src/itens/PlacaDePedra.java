package itens;

public class PlacaDePedra extends Item {
    private boolean SandubinhaUsandoPlaca = false;

    public PlacaDePedra(String nome) {
        super(nome,
                "Direito a sortear 4 números de uma só vez a cada ataque",
                "Caso ele erre o número secreto do monstro, o próximo ataque do monstro ganha +2 de dano");
    }

    public void ativarPlacaDePedra() {
        this.SandubinhaUsandoPlaca = true;
    }

    public void desativarPlacaDePedra() {
        this.SandubinhaUsandoPlaca = false;
    }

    public boolean statusPlacaDePedra() {
        return SandubinhaUsandoPlaca;
    }

}
