package venus.acoes;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import venus.modelo.Empresa;
import venus.modelo.RepositorioDeEmpresas;

public class MostrarEmpresa implements Acao {

	@Override
	public void executar(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		
		RepositorioDeEmpresas repositorio = new RepositorioDeEmpresas();
		
		Empresa empresa = repositorio.getEmpresa(id);
		
		req.setAttribute("empresa", empresa);		
		req.getRequestDispatcher("/page/editarEmpresa.jsp").forward(req, resp);	
	}

}
