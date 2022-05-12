package ExerciciosPoo.Cliente;

public class cliente {
	
	private String nome;
	private String sobrenome;
	private String cidade;
	private String estado;
	
	public cliente (String n, String s, String c, String e)
	{
		nome = n;
		sobrenome = s;
		cidade = c;
		estado = e;
	}
	
public String getInformacao() {
		
		String Informacao = nome + " "+ sobrenome +"  "+" "+ cidade +"/"+estado;
		return Informacao;
	}

}