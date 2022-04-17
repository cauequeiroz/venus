package venus.api;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import venus.modelo.Empresa;
import venus.modelo.Repositorio;

@WebServlet("/api/empresas")
public class EmpresasService extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		List<Empresa> empresas = Repositorio.getEmpresas();
		
		Gson gson = new Gson();
		String json = gson.toJson(empresas);
		
		resp.setContentType("application/json");
		resp.getWriter().print(json);					
	}

}
