package venus.controlador.acoes;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import venus.controlador.Acao;
import venus.modelo.Empresa;
import venus.modelo.Repositorio;

public class AlterarEmpresa implements Acao {

	@Override
	public String executar(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		String nome = req.getParameter("nome");
		
		Repositorio repositorio = new Repositorio();
		
		Empresa empresa = repositorio.getEmpresa(id);
		empresa.setNome(nome);
		
		return "redirect:MostrarListaDeEmpresas";
	}

}
