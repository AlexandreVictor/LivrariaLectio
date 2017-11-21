package br.com.LivrariaLectio.BO;

import java.util.List;

import br.com.LivrariaLectio.DAO.ClienteDAO;
import br.com.LivrariaLectio.entidade.Cliente;

public class ClienteBO {
	
	
	ClienteDAO clienteDAO = new ClienteDAO();
	
	
	/*chama os metodos da genericDAO*/
	public void incluir(Cliente cliente) {
		clienteDAO.incluir(cliente);
	}
	
	private void atualizar(Cliente cliente) {
		clienteDAO.atualizar(cliente);
	}
	
	public Cliente recuperar(int id) {
		return clienteDAO.recuperar(id);
	} 
	
	
	private void excluir(Cliente cliente) {
		clienteDAO.excluir(cliente);
	}
	
	public List<Cliente> recuperarTodos(){
		return clienteDAO.recuperarTodos();

	}
	
	
	

}
