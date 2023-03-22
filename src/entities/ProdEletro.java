package entities;

import java.time.LocalDateTime;

public class ProdEletro extends Produto {
    private static double impostoEletro;
    private static LocalDateTime hora;
    private static LocalDateTime garantia;

    public ProdEletro(int cod, String nome, double preco) {
        super(cod, nome, preco);
        hora = LocalDateTime.now();
    }

    public LocalDateTime garantia() {
        garantia = hora;
        garantia = hora.plusMonths(3);
        return garantia;
    }

    public static void setImposto(double valor) {
        impostoEletro = valor;
    }

    @Override
    public double getPreco() {
        return super.getPreco() + (super.getPreco()) * impostoEletro / 100;
    }

    @Override
    public String toString() {
        return String.format("Data da compra: %s%nGarantia: %s", hora, garantia());
    }
}
