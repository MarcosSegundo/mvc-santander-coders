package br.com.controller;

import br.com.model.Telefone;
import br.com.view.TelefoneView;

public class TelefoneController extends Controller<Telefone, TelefoneView>{

    public TelefoneController(Telefone model, TelefoneView view) {
        super(model, view);
    }

    public String getTelefoneDdd() {
        return model.getDdd();
    }

    public String getTelefoneNumero() {
        return model.getNumero();
    }

    public void setTelefoneDdd(String ddd) {
        model.setDdd(ddd);
    }

    public void setTelefoneNumero(String numero) {
        model.setNumero(numero);
    }

    @Override
    public void atualizarView() {
        view.imprimirDetalhes(model);
    }
}
