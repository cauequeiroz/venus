package venus.controlador;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import venus.modelo.RepositorioDeEmpresas;

public class RemoverEmpresa implements Acao {

	@Override
	public String executar(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		
		RepositorioDeEmpresas repositorio = new RepositorioDeEmpresas();
		repositorio.remover(id);
		
		return "redirect:entrada?acao=MostrarListaDeEmpresas";		
	}
}
