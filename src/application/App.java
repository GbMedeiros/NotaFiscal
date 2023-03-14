package application;

import entities.Cliente;
import entities.ItemVenda;
import entities.Produto;
import entities.Venda;

public class App {
    public static void main(String[] args) {

        Cliente c1 = new Cliente("Pateta", 1232);
        Cliente c2 = new Cliente("Donald", 1242);

        Produto p1 = new Produto(102, "Coca-cola", 5.60);
        Produto p2 = new Produto(042, "Bala", 0.50);
        Produto p3 = new Produto(630, "Sabao", 3.50);

        Venda v1 = new Venda(c1);
        v1.inserir(3,p2);
        v1.inserir(p1);
        v1.inserir(4, new Produto(432, "Tomate", 2.50));

        System.out.println(v1.getNotaFical());

    }
}
