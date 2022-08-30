package entity;

import java.util.GregorianCalendar;

public class Produto {

	private Integer codigo;
	private String categoria;
	private String nome;
	private Boolean temLojaFisica;
	private Integer quantidade;
	private Float preco;
	GregorianCalendar dataValidade;
	private String descricao;
	
	public Produto() {
		super();
	}

	

	public Produto(Integer codigo, String categoria, String nome, Boolean temLojaFisica, Integer quantidade,
			Float preco, GregorianCalendar dataValidade, String descricao) {
		super();
		this.codigo = codigo;
		this.categoria = categoria;
		this.nome = nome;
		this.temLojaFisica = temLojaFisica;
		this.quantidade = quantidade;
		this.preco = preco;
		this.dataValidade = dataValidade;
		this.descricao = descricao;
	}
	
	



	public Produto(String categoria, String nome, Boolean temLojaFisica, Integer quantidade, Float preco,
			GregorianCalendar dataValidade, String descricao) {
		super();
		this.categoria = categoria;
		this.nome = nome;
		this.temLojaFisica = temLojaFisica;
		this.quantidade = quantidade;
		this.preco = preco;
		this.dataValidade = dataValidade;
		this.descricao = descricao;
	}



	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Boolean getTemLojaFisica() {
		return temLojaFisica;
	}

	public void setTemLojaFisica(Boolean temLojaFisica) {
		this.temLojaFisica = temLojaFisica;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Float getPreco() {
		return preco;
	}

	public void setPreco(Float preco) {
		this.preco = preco;
	}

	public GregorianCalendar getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(GregorianCalendar dataValidade) {
		this.dataValidade = dataValidade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	
	


	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", categoria=" + categoria + ", nome=" + nome + ", temLojaFisica="
				+ temLojaFisica + ", quantidade=" + quantidade + ", preco=" + preco + ", dataValidade=" + dataValidade
				+ ", descricao=" + descricao + "]";
	}
	
	
	
	
	
	
	
	
	
}
