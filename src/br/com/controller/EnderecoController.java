package br.com.controller;

import br.com.model.Endereco;
import br.com.view.EnderecoView;

public class EnderecoController extends Controller<Endereco, EnderecoView>{

    public EnderecoController(Endereco model, EnderecoView view) {
        super(model, view);
    }

    public String getEnderecoRua() {
        return model.getRua();
    }

    public String getEnderecoBairro() {
        return model.getBairro();
    }

    public int getEnderecoNumero() {
        return model.getNumero();
    }

    public void setEnderecoRua(String rua) {
        model.setRua(rua);
    }

    public void setEnderecoBairro(String bairro) {
        model.setBairro(bairro);
    }

    public void setEnderecoNumero(int numero) {
        model.setNumero(numero);
    }

    @Override
    public void atualizarView() {
        view.imprimirDetalhes(model);
    }
}
