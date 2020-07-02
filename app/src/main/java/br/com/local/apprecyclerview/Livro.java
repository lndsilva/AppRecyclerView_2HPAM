package br.com.local.apprecyclerview;

public class Livro {
    //Atributos / variáveis globais
    private String titulo;
    private String descricao;
    private String categoria;
    private int imagem;

    //Construtores
    public Livro() {
    }

    public Livro(String titulo, String descricao, String categoria, int imagem) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.categoria = categoria;
        this.imagem = imagem;
    }

    //os getters e setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }
}
