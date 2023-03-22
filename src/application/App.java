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
        v1.inserir(3, p2);
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
        System.out.println(cadProd.toString());

        ProdAlcoolico pa1 = new ProdAlcoolico(300, "Vodka", 50.0);
        ProdAlcoolico pa2 = new ProdAlcoolico(423, "Gin", 67.00);
        ProdAlcoolico pa3 = new ProdAlcoolico(524, "Tequila", 90.0);
        ProdAlcoolico pa4 = new ProdAlcoolico(856, "Cerveja", 9.0);
        cadProd.inserir(pa1);
        cadProd.inserir(pa2);
        cadProd.inserir(pa3);
        cadProd.inserir(pa4);
        ProdAlcoolico.setImposto(50);

        System.out.println(cadProd.toString());

        ProdEletro pe1 = new ProdEletro(342, "Note", 3200);
        ProdEletro pe2 = new ProdEletro(234, "Celular", 2300);
        ProdEletro pe3 = new ProdEletro(243, "Carregador", 200);
        ProdEletro pe4 = new ProdEletro(837, "Fone", 30);
        cadProd.inserir(pe1);
        cadProd.inserir(pe2);
        cadProd.inserir(pe3);
        cadProd.inserir(pe4);
        ProdEletro.setImposto(20);
        v1.inserir(pe1);

        System.out.println(pe1.toString());

        System.out.println(v1.getNotaFical());

    }
}
