package entities;

/*  abstratc class
    nao podendo dar new cliente

 */
public abstract class Cliente {

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
    //tem todas filhas, sao obrigadas a instanciar (Modelo)
    public abstract String getId();


    @Override
    public String toString() {
        return String.format("[%d] %-15s", codigo, nome);
    }
}
