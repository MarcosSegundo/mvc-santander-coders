package br.com.view;

import br.com.model.Endereco;

public class EnderecoView implements View<Endereco>{

    @Override
    public void imprimirDetalhes(Endereco endereco) {
        System.out.println(endereco);
    }
}
