package entities;

import java.util.ArrayList;

public class CadastroCliente {
  private ArrayList< Cliente> clientes;
  private static CadastroCliente instance;
  public CadastroCliente(){
      clientes = new ArrayList<>();
  }
  public CadastroCliente getInstance(Cliente cliente){
      if(instance == null){
          instance = new CadastroCliente();
      }
      return instance;
  }
}
