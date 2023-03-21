package entities;

import java.util.ArrayList;

public class CadastroCliente {
    private ArrayList<Cliente> clientes;
    private Cliente cli;

    private CadastroCliente() {
        clientes = new ArrayList<>();
    }

    private static CadastroCliente instance;

    public static CadastroCliente getInstance() {
        if (instance == null) {
            instance = new CadastroCliente();
        }
        return instance;
    }

    public Cliente buscar(Cliente cliente) {
        for (Cliente cli : clientes) {
            if (cliente.getCodigo() == cli.getCodigo()) {
                return cliente;
            }
        }
        return null;
    }

    public void inserir(Cliente cli) {
        clientes.add(cli);
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("\n\nCadastro Clientes");
        for (Cliente cli : clientes) {
            str.append("\n"+cli.toString());
        }
        return String.format("%s", str);
    }
}
