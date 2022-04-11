package venus.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import venus.modelo.Empresa;
import venus.modelo.RepositorioDeEmpresas;

@WebServlet(urlPatterns = "/processaCadastro")
public class ProcessaCadastroServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		String nomeDaEmpresa = req.getParameter("nome");
		
		RepositorioDeEmpresas repositorio = new RepositorioDeEmpresas();
		repositorio.adicionar(new Empresa(nomeDaEmpresa));
		
		resp.sendRedirect("listarEmpresas");
	}
	
}
