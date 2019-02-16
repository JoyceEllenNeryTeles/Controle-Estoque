
public class Produto {
	
	String nome;
	double preco;
	String descricao;
	Integer quantidadeEstoque;
	Categoria categoria;
	
	public Produto(String nome, double preco, String descricao,  Integer quantidadeEstoque, Categoria categoria) {

		this.nome = nome;
		this.preco = preco;
		this.descricao = descricao;
		this.quantidadeEstoque = quantidadeEstoque;
		
		this.categoria = categoria;
		
	}
	
	public String getProduto() {
		return nome + " - R$" + preco; 
	}

	public Categoria getCategoria() {
		return categoria;
	}


}
