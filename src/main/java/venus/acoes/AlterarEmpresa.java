package venus.acoes;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import venus.modelo.Empresa;
import venus.modelo.RepositorioDeEmpresas;

public class AlterarEmpresa implements Acao {

	@Override
	public void executar(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		String nome = req.getParameter("nome");
		
		RepositorioDeEmpresas repositorio = new RepositorioDeEmpresas();
		
		Empresa empresa = repositorio.getEmpresa(id);
		empresa.setNome(nome);
		
		resp.sendRedirect("entrada?acao=TelaMostrarLidaDeEmpresas");
	}

}
