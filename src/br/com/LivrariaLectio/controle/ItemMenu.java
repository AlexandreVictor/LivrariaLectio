package br.com.LivrariaLectio.controle;

import java.util.List;

public class ItemMenu implements Comparable<ItemMenu> {

	private String codigoMenu;
	private String descricaoMenu;
	private List<SubItemMenu> subItems;
	private String acao;


	public String getCodigoMenu() {
		return codigoMenu;
	}

	public void setCodigoMenu(String codigoMenu) {
		this.codigoMenu = codigoMenu;
	}

	public String getDescricaoMenu() {
		return descricaoMenu;
	}

	public void setDescricaoMenu(String descricaoMenu) {
		this.descricaoMenu = descricaoMenu;
	}

	public List<SubItemMenu> getSubItems() {
		return subItems;
	}

	public void setSubItems(List<SubItemMenu> subItems) {
		this.subItems = subItems;
	}

	public int compareTo(ItemMenu o) {
		String obCodigoMenu = o.getCodigoMenu();
		String codigoAux = this.getCodigoMenu();
		return codigoAux.compareTo(obCodigoMenu);
	}

	public String getAcao() {
		return acao;
	}

	public void setAcao(String acao) {
		this.acao = acao;
	}
	
}
