package entities;

public class ClientePF extends Cliente{
    private static String cpf;
    public ClientePF(String nome, int codigo, String umCpf) {
        super(nome, codigo);
        cpf = umCpf;
    }

    public String getId() {
        return cpf;
    }
    //polimorfismo é pode juntar informacoes de classes heranças
    @Override
    public String toString(){
        return String.format("%s CPF: %-10s", super.toString(), cpf);
    }
}
