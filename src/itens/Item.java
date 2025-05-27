package itens;

public class Item {
    private String nome;
    private String efeitoPositivo;
    private String efeitoNegativo;

    public Item(String nome, String efeitoPositivo, String efeitoNegativo) {
        this.nome = nome;
        this.efeitoPositivo = efeitoPositivo;
        this.efeitoNegativo = efeitoNegativo;
    }

    public String getNome() {
        return nome;
    }
    public String getEfeitoPositivo() {
        return efeitoPositivo;
    }

    public String getEfeitoNegativo() {
        return efeitoNegativo;
    }

}
