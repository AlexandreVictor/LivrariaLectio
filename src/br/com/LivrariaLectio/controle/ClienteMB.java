package br.com.LivrariaLectio.controle;

import java.text.Format;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.context.FacesContext;
import javax.persistence.Column;

import br.com.LivrariaLectio.BO.ClienteBO;
import br.com.LivrariaLectio.entidade.Cliente;
import br.com.LivrariaLectio.util.DataUtil;


public class ClienteMB {
	
	private List<Cliente> ListaCliente;		
	private int codcliente;
	private String usuario;
	private String senha;
	private String nome;
	private String cpf;
	private String datanascimento;
	private ClienteBO bo = new ClienteBO();

	FacesContext context = FacesContext.getCurrentInstance();
	Locale locale = context.getViewRoot().getLocale();
	ResourceBundle bundle = ResourceBundle.getBundle(FacesContext
			.getCurrentInstance().getApplication().getMessageBundle(), locale);

	
	public void gravar() {
		String msg = "";
		Severity info = null;
		Cliente cliente = new Cliente();
		cliente.setUsuario(usuario);
		cliente.setSenha(senha);
		cliente.setNome(nome);
		cliente.setCpf(cpf);
		cliente.setDatanascimento(datanascimento);
		bo.incluir(cliente);
		info = FacesMessage.SEVERITY_INFO;
		msg = bundle.getString("registroIncluido");
		context.addMessage(null, new FacesMessage(info, msg, ""));
		getListaCliente();
		nome = "";
		usuario = "";
		senha = "";
		cpf = "";
		
	
	}
	
	
	public void excluir() {}
	
	/*pega todos os cliente que foram incluidos*/
	
	public List<Cliente> getListaCliente() {
		 ListaCliente = bo.recuperarTodos();
		return ListaCliente;
	}

	public void setListaCliente(List<Cliente> listaCliente) {
		ListaCliente = listaCliente;
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
