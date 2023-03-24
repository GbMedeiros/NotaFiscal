package entities;

public class Cliente {

    private String nome;
    private int codigo;

    public Cliente(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }
    @Override
    public String toString(){
        return String.format("[%d] %-15s",codigo, nome);
    }
}
