package Heran�a;

public class Main extends Animal {

	public static void main(String[] args) {
		Cachorro c1 = new Cachorro();
		Cavalo co = new Cavalo();
		Pregui�a pa = new Pregui�a();
		
		c1.emitisom();
		c1.mododeandarcachorro();
		c1.nome="Tody";
		c1.idade=4;
		c1.locomocao="Correr";
		c1.som=true;
		
		
		co.nome="p� de pano";
		co.idade=7;
		co.som=true;
		co.mododeandar();
		
		
		pa.nome="Andr�";
		pa.idade=10;
		pa.mododeandar();
		pa.som=true;
		
		
		

	}

}