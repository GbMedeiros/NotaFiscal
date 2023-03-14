package entities;

public class ItemVenda {
    private Produto produto;
    private int quantidade;

    public ItemVenda(int quantidade, Produto produto) {
        this.quantidade = quantidade;
        this.produto = produto;
    }


    public double getValor() {
        return quantidade * produto.getPreco();
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }
    @Override
    public String toString(){
        return String.format("(%03d) %-15s %5.2f %2d %7.2f", produto.getCodigo(), produto.getNome(),produto.getPreco(),this.quantidade, getValor() );
    }
}
