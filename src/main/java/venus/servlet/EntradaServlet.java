package venus.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import venus.acoes.AlterarEmpresa;
import venus.acoes.CadastrarEmpresa;
import venus.acoes.MostrarEmpresa;
import venus.acoes.MostrarListaDeEmpresas;
import venus.acoes.RemoverEmpresa;

@WebServlet(urlPatterns = "/entrada")
public class EntradaServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String acao = req.getParameter("acao");
		
		if (acao.equals("RemoverEmpresa")) {
			new RemoverEmpresa().executar(req, resp);
		}
		
		if (acao.equals("AlterarEmpresa")) {
			new AlterarEmpresa().executar(req, resp);
		}
		
		if (acao.equals("CadastrarEmpresa")) {
			new CadastrarEmpresa().executar(req, resp);
		}
		
		if (acao.equals("MostrarEmpresa")) {
			new MostrarEmpresa().executar(req, resp);
		}		
		
		if (acao.equals("TelaMostrarLidaDeEmpresas")) {
			new MostrarListaDeEmpresas().executar(req, resp);
		}
		
		if (acao.equals("TelaCadastrarEmpresa")) {
			req.getRequestDispatcher("/page/cadastrarEmpresa.jsp").forward(req, resp);
		}
	}
}
