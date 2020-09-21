package br.com.model;

public class Pedido {
    private String nfe;
    private String dataEmissao;
    private String statusPedido;
    private double valor;

    public Pedido(String nfe, String dataEmissao, String statusPedido, double valor) {
        this.nfe = nfe;
        this.dataEmissao = dataEmissao;
        this.statusPedido = statusPedido;
        this.valor = valor;
    }

    public String getNfe() {
        return nfe;
    }

    public void setNfe(String nfe) {
        this.nfe = nfe;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public String getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(String statusPedido) {
        this.statusPedido = statusPedido;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return String.format("%s:%nNF-e: %s%nData Emissão: %s%nValor: %.2f%nStatus: %s%n",
                getClass().getSimpleName(), getNfe(), getDataEmissao(), getValor(), getStatusPedido());
    }
}
