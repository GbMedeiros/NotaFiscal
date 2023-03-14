package entities;

import java.util.ArrayList;

public class Venda {
    private Cliente cliente;
    private ArrayList<ItemVenda> itens;
    public Venda(Cliente cliente){
        this.cliente = cliente;
        itens = new ArrayList<>();
    }
    public void inserir(Produto produto){
        itens.add(new ItemVenda(1, produto));
    }
    public void inserir(int quantidade, Produto produto){
        itens.add(new ItemVenda(quantidade, produto));
    }
    public double valorTotal(){
        double total =0;
        for(ItemVenda item:itens){
            total += item.getValor();
        }
        return total;
    }
    public String getNotaFical(){
        StringBuilder rel = new StringBuilder("\n Comprador"+cliente.toString());
        rel.append("\n - - - - - - - - - - - - - - - \n");

        for(ItemVenda item : itens){
            rel.append(item.toString());
            rel.append("\n");
        }
        rel.append("Valor total R$:"+valorTotal());
        rel.append("\n - - - - - - - - - - - - - - - \n");
        return rel.toString();
    }

}

