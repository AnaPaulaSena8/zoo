package br.edu.animal;
import br.edu.interfaces.Pet;


public class Gato extends Feline implements Pet{
	
	public void Emitirsom() {
		System.out.println("miuauuuuuuuu");
		
	}
	
	public void nome() {
		System.out.println("gato");
	}
	@Override
	public void local() {
		System.out.println("todo lugar");
	}
	@Override
	public void nichoEc() {
		System.out.println("mamiferos");
	}

	@Override
	public void serAmigavel() {
		System.out.println("miau<3");		
	}

	@Override
	public void brincar() {
        System.out.println("MIAUKKKKKK");		
	}
}
