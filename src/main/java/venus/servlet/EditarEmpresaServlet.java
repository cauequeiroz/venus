package venus.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import venus.modelo.Empresa;
import venus.modelo.RepositorioDeEmpresas;

@WebServlet(urlPatterns = "/editarEmpresa")
public class EditarEmpresaServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		
		RepositorioDeEmpresas repositorio = new RepositorioDeEmpresas();
		
		Empresa empresa = repositorio.getEmpresa(id);
		
		req.setAttribute("empresa", empresa);		
		req.getRequestDispatcher("/page/editarEmpresa.jsp").forward(req, resp);		
	}
}
