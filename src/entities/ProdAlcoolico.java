package entities;

import java.time.LocalDateTime;

public class ProdAlcoolico extends Produto {
    private static double impostoAlcool;


    public ProdAlcoolico(int cod, String nome, double preco) {
        super(cod, nome, preco);
    }

    public static void setImposto(double preco){
        impostoAlcool = preco;
    }
    @Override
    public double getPreco(){
        return (super.getPreco()) * (impostoAlcool/100);
    }

}
