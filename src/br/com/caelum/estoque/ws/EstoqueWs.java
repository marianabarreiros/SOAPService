package br.com.caelum.estoque.ws;

import java.util.List;

import javax.jws.WebService;

import br.com.caelum.estoque.modelo.item.*;

//Para dizer que � um servi�o web
@WebService
public class EstoqueWs {
	
	private ItemDao dao = new ItemDao();

	public List<Item> getItens(){
		
		System.out.println("Chamando o m�todo getItns()");
		List<Item> lista = dao.todosItens();
		return lista;
	}
}
