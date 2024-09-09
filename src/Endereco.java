/**
 * Classe que representa um endereço completo.
 */
public class Endereco {
    private int cep; // Código de Endereçamento Postal (CEP)
    private String rua;
    private String bairro;
    private String complemento;
    private int numeroCasa;

    public Endereco(int cep, String rua, String bairro, String complemento, int numeroCasa) {
        this.cep = cep;
        this.rua = rua;
        this.bairro = bairro;
        this.complemento = complemento;
        this.numeroCasa = numeroCasa;
    }

    // Getters e Setters
    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public int getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(int numeroCasa) {
        this.numeroCasa = numeroCasa;
    }
}
