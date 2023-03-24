package entities;

public class Estudante extends ClientePF {
    private static String matricula;
    private static String faculdade;

    public Estudante(String nome, int codigo, String umCpf, String matr, String facul){
        super(nome, codigo, umCpf);
        matricula = matr;
        faculdade = facul;
    }
    public String getMatricula(){
        return matricula;
    }
    public String getFaculdade(){
        return faculdade;
    }

    @Override
    public String toString() {
        return String.format("%s Matricula: [%s] Faculdade: %s",super.toString(),matricula, faculdade);
    }
}
