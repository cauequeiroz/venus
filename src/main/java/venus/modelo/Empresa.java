package venus.modelo;

public class Empresa {
	private static int globalId = 1;
	
	private int id;
	private String nome;
	
	public Empresa(String nome) {
		this.id = Empresa.globalId;
		this.nome = nome;
		
		Empresa.globalId++;
	}
	
	public int getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return String.format("#%d %s", id, nome);
	}
}
