package br.com.LivrariaLectio.controle;

import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.context.FacesContext;

import br.com.LivrariaLectio.BO.LivroBO;
import br.com.LivrariaLectio.entidade.Livro;
import br.com.LivrariaLectio.util.DataUtil;


public class LivroMB {

	private List<Livro> ListaLivro;		
	private int codlivro;
	private String nome;
	private String autor;
	private String datapublicacao;
	private int quantidade;
	private LivroBO bo = new LivroBO();

	FacesContext context = FacesContext.getCurrentInstance();
	Locale locale = context.getViewRoot().getLocale();
	ResourceBundle bundle = ResourceBundle.getBundle(FacesContext
			.getCurrentInstance().getApplication().getMessageBundle(), locale);

	
	public void gravar() {
		String msg = "";
		Severity info = null;
		Livro cliente = new Livro();
		cliente.setNome(nome);
		cliente.setAutor(autor);
		cliente.setDatapublicacao(datapublicacao);
		cliente.setQuantidade(quantidade);
		bo.incluir(cliente);
		info = FacesMessage.SEVERITY_INFO;
		msg = bundle.getString("registroIncluido");
		context.addMessage(null, new FacesMessage(info, msg, ""));
		getListaLivro();
		nome = "";
		autor = "";
		datapublicacao = "";
		quantidade = 0;
	
	}
	
	
	public void excluir() {}
	
	/*pega todos os cliente que foram incluidos*/
	
	
	
	
	
	public List<Livro> getListaLivro() {
		 ListaLivro = bo.recuperarTodos();
		return ListaLivro;
	}

	public void setListaLivro(List<Livro> listaLivro) {
		ListaLivro = listaLivro;
	}

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
