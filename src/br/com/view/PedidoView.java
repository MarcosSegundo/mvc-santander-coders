package br.com.view;

import br.com.model.Pedido;

public class PedidoView implements View<Pedido>{

    @Override
    public void imprimirDetalhes(Pedido pedido) {
        System.out.println(pedido);
    }
}
