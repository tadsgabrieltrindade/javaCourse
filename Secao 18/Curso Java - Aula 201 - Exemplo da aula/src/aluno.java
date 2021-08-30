
public class aluno implements Comparable<aluno>{
	//essa interface possibilita implementar a maneira como vai ser comparado os objetos. 
	public String nome;
	public Integer id;
	
	public aluno(String nome, int id) {
		this.nome = nome;
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public int compareTo(aluno o) {
		return -id.compareTo(o.getId()); //com o menos é descrescente 
	}
	
	@Override
	public String toString() {
		return "Nome: " + getNome() + " - ID: " + getId();
	}
}
