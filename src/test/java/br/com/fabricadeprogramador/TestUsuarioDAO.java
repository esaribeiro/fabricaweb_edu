package br.com.fabricadeprogramador;

import br.com.fabricadeprogramador.persistencia.entidade.Usuario;
import br.com.fabricadeprogramador.persistencia.jdbc.UsuarioDAO;

public class TestUsuarioDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		testExcluir();
	}
	
	public static void testCadastrar(){
		// Criando usuário
		Usuario usu = new Usuario();
		
		usu.setNome("Eduardo");
		usu.setLogin("Edu");
		usu.setSenha("a");
		
		// Cadastrando usuário no banco de dados
		UsuarioDAO usuDAO = new UsuarioDAO();
		
		usuDAO.cadastrar(usu);
		
		System.out.println("Cadastrado com sucesso");
	}
	
	public static void testAlterar(){
		// criando usuário
		Usuario usu = new Usuario();
		usu.setId(3);
		usu.setNome("Eduardo Ribeiro");
		usu.setLogin("Edu");
		usu.setSenha("a");
		
		// Alterando usuário no banco de dados
		UsuarioDAO usuDAO = new UsuarioDAO();
		
		usuDAO.alterar(usu);
		
		System.out.println("Alterado com sucesso");
	}
	
	public static void testExcluir(){
		// criando usuário
		Usuario usu = new Usuario();
		usu.setId(3);

		
		// Excluindo usuário no banco de dados
		UsuarioDAO usuDAO = new UsuarioDAO();
		
		usuDAO.excluir(usu);
		
		System.out.println("Excluido com sucesso");
	}
}
