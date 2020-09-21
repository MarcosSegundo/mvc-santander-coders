package br.com.controller;

import br.com.model.Pedido;
import br.com.view.PedidoView;

public class PedidoController extends Controller<Pedido, PedidoView>{

    public PedidoController(Pedido model, PedidoView view) {
        super(model, view);
    }

    public String getPedidoNfe() {
        return model.getNfe();
    }

    public String getPedidoDataEmissao() {
        return model.getDataEmissao();
    }

    public String getPedidoStatusPedido() {
        return model.getStatusPedido();
    }

    public double getPedidoValor() {
        return model.getValor();
    }

    public void setPedidoValor(double valor) {
        model.setValor(valor);
    }

    public void setPedidoStatusPedido(String pedido) {
        model.setStatusPedido(pedido);
    }

    public void setPedidoDataEmissao(String dataEmissao) {
        model.setDataEmissao(dataEmissao);
    }

    public void setPedidoNfe(String nfe) {
        model.setNfe(nfe);
    }

    @Override
    public void atualizarView() {
        view.imprimirDetalhes(model);
    }
}
