package br.com.view;

import br.com.model.Cliente;

public class ClienteView implements View<Cliente>{

    @Override
    public void imprimirDetalhes(Cliente cliente) {
        System.out.println(cliente);
    }
}
