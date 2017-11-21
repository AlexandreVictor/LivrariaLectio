package br.com.LivrariaLectio.BO;

import java.util.List;

import br.com.LivrariaLectio.DAO.LivroDAO;
import br.com.LivrariaLectio.entidade.Livro;

public class LivroBO {
	
	
	LivroDAO livroDAO = new LivroDAO();
	
	
	/*chama os metodos da genericDAO*/
	public void incluir(Livro livro) {
		livroDAO.incluir(livro);
	}
	
	private void atualizar(Livro livro) {
		livroDAO.atualizar(livro);
	}
	
	public Livro recuperar(int id) {
		return livroDAO.recuperar(id);
	} 
	
	
	private void excluir(Livro livro) {
		livroDAO.excluir(livro);
	}
	
	public List<Livro> recuperarTodos(){
		return livroDAO.recuperarTodos();

	}
	
	
	

}
