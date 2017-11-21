package br.com.LivrariaLectio.controle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.el.MethodExpression;
import javax.faces.application.NavigationHandler;
import javax.faces.context.FacesContext;

import org.richfaces.component.html.HtmlDropDownMenu;
import org.richfaces.component.html.HtmlMenuGroup;
import org.richfaces.component.html.HtmlMenuItem;
import org.richfaces.component.html.HtmlToolBar;

public class MenuMB {

	private String usuario;
	private String senha;
	HtmlToolBar menuBar;
	List<ItemMenu> menus;

	public HtmlToolBar getMenuBar() throws Exception {
		montarMenu();
		return menuBar;
	}

	public void setMenuBar(HtmlToolBar menuBar) {
		this.menuBar = menuBar;
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

	public HtmlToolBar montarMenu() {

		HtmlToolBar menu = new HtmlToolBar();
		if (menuBar == null) {
			menuBar = new HtmlToolBar();
			HtmlDropDownMenu menuDrop = new HtmlDropDownMenu();
			menuDrop.setValue("Menu");

			usuario = (String) FacesContext.getCurrentInstance()
					.getExternalContext().getSessionMap().get("usuario");

			try {
				menus = buscaMenu();
			} catch (Exception e) {
				return null;
			}

			Collections.sort(menus);

			for (ItemMenu item : menus) {

				if (!item.getSubItems().isEmpty()) {
					HtmlMenuGroup menuGrop = new HtmlMenuGroup();
					menuGrop.setValue(item.getDescricaoMenu());
					for (SubItemMenu sub : item.getSubItems()) {
						HtmlMenuItem menuItem = new HtmlMenuItem();
						MethodExpression actionFicha = FacesContext
								.getCurrentInstance()
								.getApplication()
								.getExpressionFactory()
								.createMethodExpression(
										FacesContext.getCurrentInstance()
												.getELContext(), sub.getAcao(),
										null, new Class<?>[0]);
						menuItem.setActionExpression(actionFicha);
						menuItem.setValue(sub.getDescricaoSubItem());
						menuGrop.getChildren().add(menuItem);
						menuDrop.getChildren().add(menuGrop);
						menuBar.getChildren().add(menuDrop);

					}
				} else {
					HtmlMenuItem menuPromo = new HtmlMenuItem();

					if (item.getAcao() != null
							&& !item.getAcao().trim().equals("")) {
						MethodExpression actionFicha = FacesContext
								.getCurrentInstance()
								.getApplication()
								.getExpressionFactory()
								.createMethodExpression(
										FacesContext.getCurrentInstance()
												.getELContext(),
										item.getAcao(), null, new Class<?>[0]);
						menuPromo.setActionExpression(actionFicha);
					}
					menuPromo.setValue(item.getDescricaoMenu());
					menuDrop.getChildren().add(menuPromo);
					menuBar.getChildren().add(menuDrop);
				}
			}

			return menu;
		} else {
			return menu;
		}
	}

	public void navegacaoAluno() {
		FacesContext context = FacesContext.getCurrentInstance();
		NavigationHandler navHandler = context.getApplication()
				.getNavigationHandler();
		navHandler.handleNavigation(context, null, "aluno");
		context = null;
	}

	public List<ItemMenu> getMenus() {
		return menus;
	}

	public void setMenus(List<ItemMenu> menus) {
		this.menus = menus;
	}

	public List<ItemMenu> buscaMenu() {
		List<ItemMenu> listaMenu = new ArrayList<ItemMenu>();
		
		List<SubItemMenu> listaSubMenu = new ArrayList<SubItemMenu>();
		ItemMenu menu = new ItemMenu();
		menu.setCodigoMenu("001");
		menu.setDescricaoMenu("Livro");
		menu.setAcao("livro");
		menu.setSubItems(listaSubMenu);
		listaMenu.add(menu);
		ItemMenu menu2 = new ItemMenu();
		menu2.setCodigoMenu("002");
		menu2.setDescricaoMenu("Cliente");
		menu2.setAcao("cliente");
		menu2.setSubItems(listaSubMenu);
		listaMenu.add(menu2);
/*	ItemMenu menu2 = new ItemMenu();
		menu2.setCodigoMenu("002");
		menu2.setDescricaoMenu("Cliente");
		menu2.setAcao("cliente");
		menu2.setSubItems(listaSubMenu);
		listaMenu.add(menu2);
		ItemMenu menu3 = new ItemMenu();
		menu3.setCodigoMenu("003");
		menu3.setDescricaoMenu("Disicplina");
		menu3.setAcao("disciplina");
		menu3.setSubItems(listaSubMenu);
		listaMenu.add(menu3);
		for (int i = 0; i < 5; i++) {
			ItemMenu menu = new ItemMenu();
			List<SubItemMenu> listaSubMenu = new ArrayList<SubItemMenu>();
			menu.setCodigoMenu("001");
			menu.setDescricaoMenu("Aluno");*/
			/*
			 * for (int j = 0; j < 10; j++) { SubItemMenu subItem = new
			 * SubItemMenu(); subItem.setCodigoSubItem("");
			 * subItem.setDescricaoSubItem(""); codigoMenu =
			 * Integer.parseInt(menu.getCodigoMenu()) +
			 * Integer.parseInt(subItem.getCodigoSubItem());
			 * 
			 * subItem.setCodigoSubItem("001");
			 * subItem.setDescricaoSubItem("ALUNO"); subItem.setAcao("aluno");
			 * listaSubMenu.add(subItem); } menu.setDescricaoMenu("ALUNO001");
			 
		}*/
		
		

		return listaMenu;

	}
}