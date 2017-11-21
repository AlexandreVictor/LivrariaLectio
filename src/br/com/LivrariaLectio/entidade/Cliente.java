package br.com.LivrariaLectio.entidade;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "cliente")
public class Cliente {

	
	@Id
	@GeneratedValue
	@Column(name ="codcliente",length=11)
	private int codcliente;
	@Column(name ="usuario",length=50)
	private String usuario;
	@Column(name ="senha",length=50)
	private String senha;
	@Column(name ="nome",length=50)
	private String nome;
	@Column(name ="cpf",length=50)
	private String cpf;
	@Column(name ="datanascimento")
	private String datanascimento;

	
	public int getCodcliente() {
		return codcliente;
	}
	public void setCodcliente(int codcliente) {
		this.codcliente = codcliente;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getDatanascimento() {
		return datanascimento;
	}
	public void setDatanascimento(String datanascimento) {
		this.datanascimento = datanascimento;
	}
	
	
	
	
}
