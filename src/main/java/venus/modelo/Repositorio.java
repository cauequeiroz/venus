package venus.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Repositorio {
	private static List<Empresa> empresas = new ArrayList<>();
	private static List<Usuario> usuarios = new ArrayList<>();
	
	static {
		Repositorio.empresas.add(new Empresa("Facebook"));
		Repositorio.empresas.add(new Empresa("Amazon"));
		Repositorio.empresas.add(new Empresa("Google"));
		
		Repositorio.usuarios.add(new Usuario("admin", "admin"));
		Repositorio.usuarios.add(new Usuario("root", "123"));
	}
	
	public void adicionarEmpresa(Empresa empresa) {
		Repositorio.empresas.add(empresa);
	}
	
	public void removerEmpresa(String id) {
		Iterator<Empresa> iterator = empresas.iterator();
		
		while(iterator.hasNext()) {
			if (iterator.next().getId() == Integer.valueOf(id)) {
				iterator.remove();
			}
		}
	}
	
	public Empresa getEmpresa(String id) {
		return Repositorio.empresas
			.stream()
			.filter(empresa -> empresa.getId() == Integer.valueOf(id))
			.findFirst()
			.orElseThrow();
	}
	
	public static List<Empresa> getEmpresas() {
		return empresas;
	}
	
	public static boolean verificarAcesso(String login, String senha) {
		for (Usuario usuario : usuarios) {
			if (usuario.verificarAcesso(login, senha)) {
				return true;
			}
		}
		
		return false;
	}
}
