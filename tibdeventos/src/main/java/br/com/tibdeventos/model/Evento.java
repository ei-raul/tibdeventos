package br.com.tibdeventos.model;

public class Evento {
	private Integer id;
	private String nome;
	private String uf;
	private String cidade;
	private AreaPesquisa areaPesquisa;
	
	public Evento(String nome, String uf, String cidade, AreaPesquisa areaPesquisa) {
		this.nome = nome;
		this.uf = uf;
		this.cidade = cidade;
		this.areaPesquisa = areaPesquisa;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getUf() {
		return uf;
	}
	
	public void setUf(String uf) {
		this.uf = uf;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public AreaPesquisa getAreaPesquisa() {
		return areaPesquisa;
	}
	
	public void setAreaPesquisa(AreaPesquisa areaPesquisa) {
		this.areaPesquisa = areaPesquisa;
	}
	
	public String toString() {
		return "[EVENTO" + (this.id != null ? (" - " + this.id) : "") + "]\n" + 
				"- NOME: " + this.nome + "\n" +
				"- CIDADE: " + this.cidade + "\n" +
				"- ESTADO (UF): " + this.uf + "\n";
	}
}
