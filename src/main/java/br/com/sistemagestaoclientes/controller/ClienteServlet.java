package br.com.sistemagestaoclientes.controller;

import br.com.sistemagestaoclientes.service.ClienteService;
import com.google.gson.Gson;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.ServletException;
import java.io.IOException;

public class ClienteServlet extends HttpServlet {
    private ClienteService clienteService;
    private Gson gson;

    @Override
    public void init() throws ServletException {
        clienteService = new ClienteService();
        gson = new Gson();
    }

    @Override
    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

    }

    @Override
    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

    }

    @Override
    protected void doPut (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

    }

    @Override
    protected void doDelete (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

    }

    private void listarClientes (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

    }

    private void buscarClientePorId (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

    }

    private void cadastrarCliente (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

    }

    private void atualizarCliente (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

    }

    private void inativarCliente (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

    }

    private void reativarCliente (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

    }

    private void enviarJson (HttpServletResponse response, Object objeto) throws ServletException, IOException{

    }
}
