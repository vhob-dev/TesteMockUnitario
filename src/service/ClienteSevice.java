package service;

import dao.ClienteDao;
import dao.IClienteDao;

public class ClienteSevice {
    private IClienteDao clienteDao;
    public ClienteSevice(){
        clienteDao = new ClienteDao();
        this.clienteDao = clienteDao;
    }
    public String salva (){
        clienteDao.salvar();
        return "Sucesso";
    }
}
