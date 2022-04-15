package venus.controlador.acoes;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import venus.controlador.Acao;
import venus.modelo.Repositorio;

public class RemoverEmpresa implements Acao {

	@Override
	public String executar(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		
		Repositorio repositorio = new Repositorio();
		repositorio.removerEmpresa(id);
		
		return "redirect:MostrarListaDeEmpresas";		
	}
}
