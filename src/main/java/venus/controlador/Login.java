package venus.controlador;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import venus.modelo.Repositorio;

public class Login implements Acao {

	@Override
	public String executar(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String login = req.getParameter("login");
		String password = req.getParameter("password");
		
		boolean usuarioEstaAutenticado = Repositorio.verificarAcesso(login, password);
		
		if (usuarioEstaAutenticado) {
			return "redirect:MostrarListaDeEmpresas";
		} else {
			return "redirect:MostrarLogin";			
		}
	}

}
