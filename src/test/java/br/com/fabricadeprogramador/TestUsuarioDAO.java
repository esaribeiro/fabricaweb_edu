package br.com.fabricadeprogramador;

import br.com.fabricadeprogramador.persistencia.entidade.Usuario;
import br.com.fabricadeprogramador.persistencia.jdbc.UsuarioDAO;

public class TestUsuarioDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		testExcluir();
	}
	
	public static void testCadastrar(){
		// Criando usu�rio
		Usuario usu = new Usuario();
		
		usu.setNome("Eduardo");
		usu.setLogin("Edu");
		usu.setSenha("a");
		
		// Cadastrando usu�rio no banco de dados
		UsuarioDAO usuDAO = new UsuarioDAO();
		
		usuDAO.cadastrar(usu);
		
		System.out.println("Cadastrado com sucesso");
	}
	
	public static void testAlterar(){
		// criando usu�rio
		Usuario usu = new Usuario();
		usu.setId(3);
		usu.setNome("Eduardo Ribeiro");
		usu.setLogin("Edu");
		usu.setSenha("a");
		
		// Alterando usu�rio no banco de dados
		UsuarioDAO usuDAO = new UsuarioDAO();
		
		usuDAO.alterar(usu);
		
		System.out.println("Alterado com sucesso");
	}
	
	public static void testExcluir(){
		// criando usu�rio
		Usuario usu = new Usuario();
		usu.setId(3);

		
		// Excluindo usu�rio no banco de dados
		UsuarioDAO usuDAO = new UsuarioDAO();
		
		usuDAO.excluir(usu);
		
		System.out.println("Excluido com sucesso");
	}
}
