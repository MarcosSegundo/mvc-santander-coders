package br.com.Main;

import br.com.controller.ClienteController;
import br.com.controller.EnderecoController;
import br.com.controller.PedidoController;
import br.com.controller.TelefoneController;
import br.com.model.Cliente;
import br.com.model.Endereco;
import br.com.model.Pedido;
import br.com.model.Telefone;
import br.com.view.ClienteView;
import br.com.view.EnderecoView;
import br.com.view.PedidoView;
import br.com.view.TelefoneView;

public class Main {
    public static void main(String[] args) {

        //Cliente Controller
        Cliente modelCliente = new Cliente(01, "Rafael", "111.111.111-11");
        ClienteView viewCliente = new ClienteView();

        ClienteController clienteController = new ClienteController(modelCliente, viewCliente);
        clienteController.atualizarView();

        //Endereço Controller
        Endereco modelEndereco = new Endereco("Projeta", "Zona Rural", 14);
        EnderecoView viewEndereco = new EnderecoView();

        EnderecoController enderecoController = new EnderecoController(modelEndereco, viewEndereco);
        enderecoController.atualizarView();

        //Pedido Controller
        Pedido modelPedido = new Pedido("015", "21/09/2020", "concluído", 100.0);
        PedidoView viewPedido = new PedidoView();

        PedidoController pedidoController = new PedidoController(modelPedido, viewPedido);
        pedidoController.atualizarView();

        //Telefone Controller
        Telefone modelTelefone = new Telefone("011", "9333-3333");
        TelefoneView viewTelefone = new TelefoneView();

        TelefoneController telefoneController = new TelefoneController(modelTelefone, viewTelefone);
        telefoneController.atualizarView();
    }
}
