package entities;

import java.time.LocalDateTime;
import java.time.Month;

public class ProdEletro extends Produto {
    private static double impostoEletro;
    private static LocalDateTime hora;
    private static LocalDateTime garantia;
    private static Month mes;

    public ProdEletro(int cod, String nome, double preco) {
        super(cod, nome, preco);
    }

    public LocalDateTime garantia() {
        hora = LocalDateTime.now();
        return garantia = LocalDateTime.from(hora.getMonth());
    }

    public static void setImposto(double valor) {
        impostoEletro = valor;
    }

    @Override
    public double getPreco() {
        return (super.getPreco()) * impostoEletro / 100;
    }
    @Override
    public String toString(){
        return String.format("");
    }
}
