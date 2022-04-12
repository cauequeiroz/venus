package venus.acoes;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import venus.modelo.Empresa;
import venus.modelo.RepositorioDeEmpresas;

public class MostrarListaDeEmpresas implements Acao {

	@Override
	public void executar(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Empresa> empresas = RepositorioDeEmpresas.getEmpresas();
		
		req.setAttribute("empresas", empresas);		
		req.getRequestDispatcher("/page/listarEmpresas.jsp").forward(req, resp);
	}

}
