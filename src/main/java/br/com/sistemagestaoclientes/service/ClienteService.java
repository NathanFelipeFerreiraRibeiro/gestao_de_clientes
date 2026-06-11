package br.com.sistemagestaoclientes.service;

import br.com.sistemagestaoclientes.dao.ClienteDAO;
import br.com.sistemagestaoclientes.model.Cliente;
import br.com.sistemagestaoclientes.model.StatusCliente;
import br.com.sistemagestaoclientes.validator.ClienteValidator;
import java.util.List;

public class ClienteService {
    private ClienteDAO clienteDAO;
    private ClienteValidator clienteValidator;

    public void cadastrar(Cliente cliente) {

    }

    public List<Cliente> listar(String nome, String cpf, String email, StatusCliente status) {

    }

    public Cliente buscarPorId(int id) {

    }

    public void atualizar(int id, Cliente cliente) {

    }

    public void inativar(int id) {

    }

    public void reativar(int id) {

    }

    private void validarCadastro(Cliente cliente) {

    }

    private void validarAtualizacao(int id, Cliente cliente) {

    }
    private Cliente buscarClienteExistente(int id) {

    }
}
