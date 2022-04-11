package venus.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RepositorioDeEmpresas {
	private static List<Empresa> empresas = new ArrayList<>();
	
	public void adicionar(Empresa empresa) {
		RepositorioDeEmpresas.empresas.add(empresa);
	}
	
	public void remover(String id) {
		Iterator<Empresa> iterator = empresas.iterator();
		
		while(iterator.hasNext()) {
			if (iterator.next().getId() == Integer.valueOf(id)) {
				iterator.remove();
			}
		}
	}
	
	public Empresa getEmpresa(String id) {
		return RepositorioDeEmpresas.empresas
			.stream()
			.filter(empresa -> empresa.getId() == Integer.valueOf(id))
			.findFirst()
			.orElseThrow();
	}
	
	public static List<Empresa> getEmpresas() {
		return empresas;
	}
}
