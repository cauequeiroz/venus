package venus.controlador.acoes;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import venus.controlador.Acao;
import venus.modelo.Repositorio;
import venus.modelo.Usuario;

public class Login implements Acao {

	@Override
	public String executar(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String login = req.getParameter("login");
		String password = req.getParameter("password");
		
		Usuario usuario = Repositorio.verificarAcesso(login, password);
		boolean usuarioEstaAutenticado = usuario != null;
		
		HttpSession sessao = req.getSession();
		
		if (usuarioEstaAutenticado) {
			sessao.setAttribute("usuario", usuario);
			
			return "redirect:MostrarListaDeEmpresas";
		} else {
			sessao.invalidate();	
			
			return "redirect:MostrarLogin";			
		}
	}

}
