package br.com.view;

import br.com.model.Telefone;

public class TelefoneView implements View<Telefone>{

    @Override
    public void imprimirDetalhes(Telefone telefone) {
        System.out.println(telefone);
    }
}
