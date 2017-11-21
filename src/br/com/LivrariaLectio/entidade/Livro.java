package br.com.LivrariaLectio.entidade;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "livro")
public class Livro {

	
	@Id
	@GeneratedValue
	@Column(name ="codlivro",length=11)
	private int codlivro;
	@Column(name ="nome",length=50)
	private String nome;
	@Column(name ="autor",length=50)
	private String autor;
	@Column(name ="datapublicacao",length=50)
	private String datapublicacao;
	@Column(name ="quantidade",length=11)
	private int quantidade;
	
	public int getCodlivro() {
		return codlivro;
	}
	public void setCodlivro(int codlivro) {
		this.codlivro = codlivro;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getDatapublicacao() {
		return datapublicacao;
	}
	public void setDatapublicacao(String datapublicacao) {
		this.datapublicacao = datapublicacao;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
}
