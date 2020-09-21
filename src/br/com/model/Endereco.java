package br.com.model;

public class Endereco {
    private String rua;
    private String bairro;
    private int numero;

    public Endereco(String rua, String bairro, int numero) {
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
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

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return String.format("%s:%nNúmero: %d%nRua: %s%nBairro: %s%n",
                getClass().getSimpleName(), getNumero(), getRua(), getBairro());
    }
}
