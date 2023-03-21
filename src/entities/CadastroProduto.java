package entities;

import java.util.ArrayList;

public class CadastroProduto {
    private ArrayList<Produto> produtos;
    private Produto prod;

    private CadastroProduto() {
        produtos = new ArrayList<>();
    }

    private static CadastroProduto instance;

    public static CadastroProduto getInstance() {
        if (instance == null) {
            instance = new CadastroProduto();
        }
        return instance;
    }

    public void inserir(Produto prod) {
        produtos.add(prod);
    }

    public void inserir(int cod, String nome, double preco) {
        produtos.add(new Produto(cod, nome, preco));
    }

    public Produto buscar(Produto prod) {
        for (Produto pro : produtos) {
            if (prod.getCodigo() == pro.getCodigo()) {
                return prod;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("\n\nCadastro de Produtos");
        for (Produto pro : produtos) {
            str.append("\n" + produtos.toString());
        }
        return String.format("%s", str);
    }
}
