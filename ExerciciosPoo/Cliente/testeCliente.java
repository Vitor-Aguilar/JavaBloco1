package ExerciciosPoo.Cliente;

public class testeCliente {

	public static void main(String[] args) {
		
		cliente cliente1 = new cliente ("Vitor", "Hugo", "Sao Paulo", "SP");
		
		System.out.println(cliente1.getInformacao());
	}

}
