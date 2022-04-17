package venus.controlador;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter("/entrada")
public class Autorizacao implements Filter {

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;
		
		String nomeDaAcao = request.getParameter("acao");
		
		boolean paginaInternaDoSistema = !(nomeDaAcao.equals("Login") || nomeDaAcao.equals("MostrarLogin"));
		boolean usuarioNaoAutenticado = request.getSession().getAttribute("usuario") == null;
		
		if (paginaInternaDoSistema && usuarioNaoAutenticado) {
			response.sendRedirect("entrada?acao=MostrarLogin");
			return;				
		}
		
		chain.doFilter(servletRequest, servletResponse);		
	}

}
