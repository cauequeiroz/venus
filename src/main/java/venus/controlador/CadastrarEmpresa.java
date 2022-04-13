package venus.controlador;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import venus.modelo.Empresa;
import venus.modelo.RepositorioDeEmpresas;

public class CadastrarEmpresa implements Acao {

	@Override
	public String executar(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nomeDaEmpresa = req.getParameter("nome");
		
		RepositorioDeEmpresas repositorio = new RepositorioDeEmpresas();
		repositorio.adicionar(new Empresa(nomeDaEmpresa));
		
		return "redirect:entrada?acao=MostrarListaDeEmpresas";
	}

}
