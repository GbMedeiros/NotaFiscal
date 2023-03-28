package application;

import entities.*;

public class App {
    public static void main(String[] args) {

        /*

        Cliente c1 = new Cliente("Pateta", 1232);
        Cliente c2 = new Cliente("Donald", 1242);

        Produto p1 = new Produto(102, "Coca-cola", 5.60);
        Produto p2 = new Produto(042, "Bala", 0.50);
        Produto p3 = new Produto(630, "Sabao", 3.50);

        v1.inserir(3, p2);
        v1.inserir(p1);
        v1.inserir(4, new Produto(432, "Tomate", 2.50));
        System.out.println(v1.getNotaFical());

        cadCli.inserir(c1);
        cadCli.inserir(c2);
        //polimorfismo é add um toipo de cliente sem ser New cliente
        System.out.println(cadCli.toString());

        cadProd.inserir(p1);
        cadProd.inserir(p2);
        cadProd.inserir(p3);
        System.out.println(cadProd.toString());
        */

        //intanciar para pode cadastrar em arrayList
        CadastroCliente cadCli = CadastroCliente.getInstance();
        CadastroProduto cadProd = CadastroProduto.getInstance();


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

        ProdEletro prode1 = new ProdEletro(342, "Note", 3200, 30);
        ProdEletro prode2 = new ProdEletro(234, "Celular", 2300, 30);
        ProdEletro prode3 = new ProdEletro(243, "Carregador", 200, 7);
        ProdEletro prode4 = new ProdEletro(837, "Fone", 30, 0);
        cadProd.inserir(prode1);
        cadProd.inserir(prode2);
        cadProd.inserir(prode3);
        cadProd.inserir(prode4);
        ProdEletro.setImposto(20);

        System.out.println(prode1.toString());

        ClientePJ pj1 = new ClientePJ("Elon", 3271, "1234");
        ClientePJ pj2 = new ClientePJ("Naruto", 2516, "4356");
        ClientePJ pj3 = new ClientePJ("Coregem", 8764, "5246");
        cadCli.inserir(pj1);
        cadCli.inserir(pj2);
        cadCli.inserir(pj3);


        Estudante e1 = new Estudante("Gabriel", 1224, "3132", "11111", "Pucrs");
        cadCli.inserir(e1);
        cadCli.inserir(new Estudante("Gien", 5425, "5245", "4234", "URFGS"));

        ClientePF pf1 = new ClientePF("Gumball", 2343, "2352");
        ClientePF pf2 = new ClientePF("Jones", 5425, "5235");
        cadCli.inserir(pf1);
        cadCli.inserir(pf2);

        System.out.println(cadCli.toString());

        Venda v1 = new Venda(pj1);
        v1.inserir(prode1);
        v1.inserir(pa2);
        v1.inserir(pa4);
        v1.inserir(3, prode4);
        System.out.println(v1.getNotaFical());
    }
}
