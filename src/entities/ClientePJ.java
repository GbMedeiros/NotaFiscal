package entities;

public class ClientePJ extends Cliente {
    private static String cnpj;
    public ClientePJ(String nome, int cod, String umCnpj){
        super(nome, cod);
        cnpj = umCnpj;
    }
    public String getId(){
        return cnpj;
    }
    @Override
    public String toString(){
        return String.format("%s CNPJ: %-10s", super.toString(), cnpj);
    }
}
