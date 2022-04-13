package venus.controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import venus.modelo.Empresa;
import venus.modelo.Repositorio;

public class MostrarListaDeEmpresas implements Acao {

	@Override
	public String executar(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Empresa> empresas = Repositorio.getEmpresas();
		
		req.setAttribute("empresas", empresas);		
		return "forward:listarEmpresas.jsp";
	}

}
