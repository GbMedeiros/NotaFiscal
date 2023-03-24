package entities;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class ProdEletro extends Produto {
    private static double impostoEletro;
    private static LocalDate hora;
    private static LocalDate garantia;

    public ProdEletro(int cod, String nome, double preco, int d) {
        super(cod, nome, preco);
        hora = LocalDate.now();
        garantia = hora.plusDays(d);
    }


    public LocalDate garantia() {
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
        return String.format("Data da compra: %s%nGarantia: %s dias", hora, garantia());
    }
}
