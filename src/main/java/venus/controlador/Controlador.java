package venus.controlador;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/entrada")
public class Controlador extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@SuppressWarnings("deprecation")
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String nomeDaAcao = req.getParameter("acao");
		String proximoPasso = null;
			
		try {
			
			Acao acao = (Acao) Class.forName("venus.controlador." + nomeDaAcao).newInstance();
			proximoPasso = acao.executar(req, resp);
			
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			throw new ServletException(e);
		}
		
		String comando = proximoPasso.split(":")[0];
		String url = proximoPasso.split(":")[1];
		
		if (comando.equals("forward")) {
			req.getRequestDispatcher("WEB-INF/view" + url).forward(req, resp);			
		} else {
			resp.sendRedirect(url);			
		}
	}
}
