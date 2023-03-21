package application;

import entities.*;

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

        CadastroCliente cadCli = CadastroCliente.getInstance();
        cadCli.inserir(c1);
        cadCli.inserir(c2);
        System.out.println(cadCli.toString());

        CadastroProduto cadProd = CadastroProduto.getInstance();
        cadProd.inserir(p1);
        cadProd.inserir(p2);
        cadProd.inserir(p3);

        ProdAlcoolico pa1 = new ProdAlcoolico(300, "Vodka", 50.0);
        ProdAlcoolico.setImposto(300);

        ProdEletro pe1 = new ProdEletro(342, "Note", 3.200);
        System.out.println(pe1.garantia());

        System.out.println(pa1.getPreco());
        System.out.println(cadCli.toString());


    }
}
