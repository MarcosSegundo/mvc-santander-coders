package br.com.controller;

import br.com.model.Cliente;
import br.com.view.ClienteView;

public class ClienteController extends Controller<Cliente, ClienteView>{

    public ClienteController(Cliente model, ClienteView view) {
        super(model, view);
    }

    public int getClienteId() {
        return model.getId();
    }

    public String getClienteNome() {
        return model.getNome();
    }

    public String getClienteCpf() {
        return model.getCpf();
    }

    public void setClientId(int id) {
        model.setId(id);
    }

    public void setClienteNome(String nome) {
        model.setNome(nome);
    }

    public void setClienteCpf(String cpf) {
        model.setCpf(cpf);
    }

    @Override
    public void atualizarView() {
        view.imprimirDetalhes(model);
    }
}
